package com.yunjae.impexcel.domain

import javax.persistence.Column

import reflect.runtime.universe
import reflect.runtime.universe._


object CreateTableScript extends App {
  def listProperties[T: TypeTag]: List[(TermSymbol, Annotation)] = {
    val fields = typeOf[T].members
      .collect {case s: TermSymbol => s}
      .filter(s => s.isVal || s.isVar)

    fields.foreach(f => {
      val annotation = f.annotations.find(_.tree.tpe =:= typeOf[Column])
      annotation.foreach(a => {
        val colName = (a.tree.children.tail)(0).children(1).toString().replace("\"", "")
        val typeName = f.typeSignature.toString
      })

    })


    // then only keep the ones with a MyProperty annotation
    fields.flatMap(f => f.annotations.find(_.tree.tpe =:= typeOf[Column]).
      map((f, _))).toList
  }

  def createStript[T: TypeTag]: List[(String, String)] = {
    val fields = typeOf[T].members
      .collect {case s: TermSymbol => s}
      .filter(s => s.isVal || s.isVar)

    fields.flatMap(f => {
      f.annotations
        .find(_.tree.tpe =:= typeOf[Column])
        .map(a => {
          val colName = (a.tree.children.tail)(0).children(1).toString().replace("\"", "")
          val typeName = f.typeSignature.toString
          (colName, typeName)
        })
    }).toList
  }

  val list = createStript[Item].reverse
  val prtStr = list.map(data => data._2 match {
    case "String" => s"${data._1} VARCHAR(4000) "
    case "Int" => s"${data._1} NUMBER "
  }).mkString(" , \n")
  println(s"CREATE TABLE B2C_ITEM \n ( ${prtStr} )")

}
