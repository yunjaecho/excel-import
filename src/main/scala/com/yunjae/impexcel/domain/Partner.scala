package com.yunjae.impexcel.domain

import com.poiji.annotation.ExcelCellName
import javax.persistence.{Column, Entity, Id, Table}

@Entity
@Table(name = "B2C_PARTNER")
class Partner {
  @Id
  @Column(name = "PTN_NO")
  @ExcelCellName("출하자코드")
  var ptnNo: String = _

  @Column(name = "PTN_NM")
  @ExcelCellName("거래처명")
  var ptnNm: String = _

  @Column(name = "PTN_GB")
  @ExcelCellName("거래처구분")
  var ptnGb: String = _

  @Column(name = "CPR_NO", nullable = true)
  @ExcelCellName("법인등록번호")
  var cprNo: String = _

  @Column(name = "BUS_NO")
  @ExcelCellName("사업자등록번호")
  var busNo: String = _

  @Column(name = "FAX_NO", nullable = true)
  @ExcelCellName("팩스번호")
  var faxNo: String = _

  @Column(name = "EMAIL")
  @ExcelCellName("이메일")
  var email: String = _

  @Column(name = "ENTER_DT")
  @ExcelCellName("입점일자")
  var enterDt: String = _

  @Column(name = "ZIP_NO")
  @ExcelCellName("우편번호")
  var zipNo: String = _

  @Column(name = "ADDR1")
  @ExcelCellName("주소")
  var addr1: String = _

  @Column(name = "ADDR2", nullable = true)
  @ExcelCellName("상세주소")
  var addr2: String = _

  @Column(name = "BIZCND")
  @ExcelCellName("업태")
  var bizcnd: String = _

  @Column(name = "INDUTY")
  @ExcelCellName("업종")
  var induty: String = _

  @Column(name = "RPRSNTV_NM")
  @ExcelCellName("대표자명")
  var rprsntvNm: String = _

  @Column(name = "RPRS_TELNO")
  @ExcelCellName("대표전화번호")
  var rprsTelno: String = _

  @Column(name = "HOME_PAGE", nullable = true)
  @ExcelCellName("홈페이지")
  var homePage: String = _

  @Column(name = "DEPART_NM")
  @ExcelCellName("소속지사")
  var departNm: String = _


  override def toString = s"Partner($ptnNo, $ptnNm, $ptnGb, $cprNo, $busNo, $faxNo, $email, $enterDt, $zipNo, $addr1, " +
    s"$addr2, $bizcnd, $induty, $rprsntvNm, $rprsTelno, $homePage, $departNm)"
}
