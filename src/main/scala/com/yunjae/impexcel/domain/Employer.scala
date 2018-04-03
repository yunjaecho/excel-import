package com.yunjae.impexcel.domain

import com.poiji.annotation.ExcelCellName
import javax.persistence.{Column, Entity, Id, Table}

@Entity
@Table(name = "B2C_EMPLOYER")
class Employer() {

  @Column(name ="PTN_NO")
  @ExcelCellName("거래처코드")
  var ptnNm: String = _

  @Id
  @Column(name ="EMP_ID")
  @ExcelCellName("사용자ID")
  var empId: String = _

  @Column(name ="USER_ID")
  @ExcelCellName("아이디")
  var userId: String = _

  @Column(name ="USER_GB")
  @ExcelCellName("사용자구분")
  var userGb: String = _

  @Column(name ="USER_NAME")
  @ExcelCellName("사용자명")
  var userName: String = _

  @Column(name ="TEL_NO", nullable = true)
  @ExcelCellName("전화번호")
  var telNo: String = _

  @Column(name ="HP_NO", nullable = true)
  @ExcelCellName("핸드폰")
  var hpNo: String = _

  @Column(name ="FAX_NO", nullable = true)
  @ExcelCellName("팩스번호")
  var faxNo: String = _

  @Column(name ="EMAIL", nullable = true)
  @ExcelCellName("이메일")
  var email: String = _

  @Column(name ="DEPART_NM", nullable = true)
  @ExcelCellName("부서")
  var departNm: String = _

  @Column(name ="POSITION", nullable = true)
  @ExcelCellName("직급")
  var position: String = _

  @Column(name ="EMAIL_RECEIVE_YN")
  @ExcelCellName("이메일수신여부")
  var emailReceiveYn: String = _

  @Column(name ="SMS_RECEIVE_YN")
  @ExcelCellName("SMS수신여부")
  var smsReceiveYn: String = _


  override def toString =
    s"Employer($ptnNm, $empId, $userId, $userGb, $userName, $telNo, $hpNo, $faxNo, $email, $departNm, $position, $emailReceiveYn, $smsReceiveYn)"
}
