package com.yunjae.impexcel.app

object Test extends App {
  val url = "http://www.eatmart.co.kr/UserFiles/1204/Image/12040510150334.JPG"

  println(url.substring(url.lastIndexOf("/")+1))
}
