package com.yunjae.impexcel.domain

import com.poiji.annotation.ExcelCellName
import javax.persistence.Column

class Partner {
  @Column(name = "PTN_NO")
  @ExcelCellName("거래처코드")
  var ptnNo: String = _

  @Column(name = "PTN_NM")
  @ExcelCellName("거래처명")
  var ptnNm: String = _

  @Column(name = "PTN_GB")
  @ExcelCellName("거래처구분")
  var ptnGb: String = _

  @Column(name = "CPR_NO")
  @ExcelCellName("법인등록번호")
  var cprNo: String = _

  @Column(name = "BUS_NO")
  @ExcelCellName("사업자등록번호")
  var busNo: String = _

  @Column(name = "FAX_NO")
  @ExcelCellName("팩스번호")
  var faxNo: String = _

  @Column(name = "EMAIL")
  @ExcelCellName("이메일")
  var email: String = _
  
}
