package com.yunjae.impexcel.app

import java.io.File

import com.poiji.bind.Poiji
import com.yunjae.impexcel.config.HibernateUtil
import com.yunjae.impexcel.domain.{Employer, Partner}
import org.hibernate.Session

object MainApp extends App {

  savePartner();

  /**
    * 출하자 소속 사용자 정보 Database import
    */
  def saveEmployer(): Unit = {
    val employees = Poiji.fromExcel(new File(ClassLoader.getSystemResource("employer.xls").getFile()), classOf[Employer])
    val session: Session = HibernateUtil.getSessionFactory.openSession();

    session.beginTransaction()

    employees.forEach(employer => {
      println(employer)
      session.save(employer);
    })

    session.getTransaction.commit()
    HibernateUtil.shutdown
  }

  def savePartner(): Unit = {
    val partners = Poiji.fromExcel(new File(ClassLoader.getSystemResource("partner.xls").getFile()), classOf[Partner])
    val session: Session = HibernateUtil.getSessionFactory.openSession();

    session.beginTransaction()

    partners.forEach(partner => {
      println(partner)
      session.save(partner);
    })

    session.getTransaction.commit()
    HibernateUtil.shutdown
  }


}
