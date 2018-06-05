package com.yunjae.impexcel.app

import java.io.File
import java.net.URL

import com.poiji.bind.Poiji
import com.typesafe.config.ConfigFactory
import com.yunjae.impexcel.config.HibernateUtil
import com.yunjae.impexcel.domain.{Employer, Item, Partner, PartnerFile}
import org.apache.commons.io.FileUtils
import org.hibernate.Session

object MainApp extends App {

  //saveEmployer();

  val conf = ConfigFactory.load
  val rootTargetPath = conf.getString("b2c.image_save_path")

  //savePartnerFile();
  saveItem();

  /**
    * 출하자 소속 사용자 정보 Database import
    */
  def saveEmployer(): Unit = {
    val employees = Poiji.fromExcel(new File(ClassLoader.getSystemResource("employer.xls").getFile()), classOf[Employer])
    val session: Session = HibernateUtil.getSessionFactory.openSession();

    session.beginTransaction()

    employees.forEach(employer => {
      println(employer)
      session.save(employer)
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
      session.save(partner)
    })

    session.getTransaction.commit()
    HibernateUtil.shutdown
  }


  def savePartnerFile(): Unit = {
    val files = Poiji.fromExcel(new File(ClassLoader.getSystemResource("partnerFile.xls").getFile()), classOf[PartnerFile])
    val session: Session = HibernateUtil.getSessionFactory.openSession();

    session.beginTransaction()

    files.forEach(partnerFile => {
      println(partnerFile)


      if (partnerFile.accountFile != null && !partnerFile.accountFile.isEmpty) {
        val sourceUrl = partnerFile.accountFile
        val targetPath = "b2c_accountFile_" + partnerFile.accountFile.substring(partnerFile.accountFile.lastIndexOf("/")+1)
        partnerFile.accountPath = targetPath
        saveFile(sourceUrl, rootTargetPath + File.separator + "SELLERATTCH_BANK_DOC" + File.separator + targetPath)
      }

      if (partnerFile.busFile != null && !partnerFile.busFile.isEmpty) {
        val sourceUrl = partnerFile.busFile
        val targetPath =  "b2c_busFile_" + partnerFile.busFile.substring(partnerFile.busFile.lastIndexOf("/")+1)
        partnerFile.busPath = targetPath
        saveFile(sourceUrl, rootTargetPath + File.separator + "SELLERATTCH_BUS_DOC" + File.separator + targetPath)
      }

      if (partnerFile.naturalFile != null && !partnerFile.naturalFile.isEmpty) {
        val sourceUrl = partnerFile.naturalFile
        val targetPath = "b2c_naturalFile_" + partnerFile.naturalFile.substring(partnerFile.naturalFile.lastIndexOf("/")+1)
        partnerFile.naturalPath = targetPath
        saveFile(sourceUrl, rootTargetPath + File.separator + "SELLERATTCH_NAT_DOC" + File.separator + targetPath)
      }

      session.save(partnerFile)
    })

    session.getTransaction.commit()
    HibernateUtil.shutdown
  }

  def saveItem(): Unit = {
    val items = Poiji.fromExcel(new File(ClassLoader.getSystemResource("item.xls").getFile()), classOf[Item])
    val session: Session = HibernateUtil.getSessionFactory.openSession();

    session.beginTransaction()

    items.forEach(item => {
      println(item)
      session.save(item)
    })

    session.getTransaction.commit()
    HibernateUtil.shutdown
  }

  /**
    * HTTP URL 이미지 저장
    * @param soureUrl
    * @param targetPath
    */
  def saveFile(soureUrl: String, targetPath: String): Unit = {
    FileUtils.copyURLToFile(new URL(soureUrl), new File(targetPath))
  }


}
