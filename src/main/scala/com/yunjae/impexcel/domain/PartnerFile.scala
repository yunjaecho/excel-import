package com.yunjae.impexcel.domain

import com.poiji.annotation.ExcelCellName
import javax.persistence.{Column, Entity, Id, Table}

@Entity
@Table(name = "B2C_PARTNER_FILE")
class PartnerFile {
  @Id
  @Column(name = "PTN_NO")
  @ExcelCellName("출하자코드")
  var ptnNo: String = _

  @Column(name = "BUS_FILE", nullable = true)
  @ExcelCellName("사업자등록증")
  var busFile: String = _

  @Column(name = "ACCOUNT_FILE", nullable = true)
  @ExcelCellName("통장사본")
  var accountFile: String = _

  @Column(name = "NATURAL_FILE", nullable = true)
  @ExcelCellName("친환경인증서")
  var naturalFile: String = _

  @Column(name = "BUS_PATH", nullable = true)
  var busPath: String = _

  @Column(name = "ACCOUNT_PATH", nullable = true)
  var accountPath: String = _

  @Column(name = "NATURAL_PATH", nullable = true)
  var naturalPath: String = _


  override def toString = s"PartnerFile($ptnNo, $busFile, $accountFile, $naturalFile, $busPath, $accountPath, $naturalPath)"
}
