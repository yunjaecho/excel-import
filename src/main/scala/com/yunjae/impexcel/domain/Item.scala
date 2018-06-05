package com.yunjae.impexcel.domain

import com.poiji.annotation.ExcelCellName
import javax.persistence.{Column, Entity, Id, Table}

@Entity
@Table(name = "B2C_ITEM")
class Item {
  @Id
  @Column(name = "ITEM_CD")
  @ExcelCellName("상품코드")
  var itemCd: String = _

  @Column(name = "PTN_NO")
  @ExcelCellName("거래처코드")
  var ptnNo: String = _

  @Column(name = "ITEM_NM")
  @ExcelCellName("상품명")
  var itemNm: String = _

  @Column(name = "ITEM_STATUS")
  @ExcelCellName("상품상태")
  var itemStatus: String = _

  @Column(name = "DSP_STATUS")
  @ExcelCellName("전시상태")
  var dspStatus: String = _

  @Column(name = "SHOP_CATE1", nullable = true)
  @ExcelCellName("쇼핑카테고리명1")
  var shopCate1: String = _

  @Column(name = "SHOP_CATE2", nullable = true)
  @ExcelCellName("쇼핑카테고리명2")
  var shopCate2: String = _

  @Column(name = "STD_CD1", nullable = true)
  @ExcelCellName("품목대대분류")
  var stdCd1: String = _

  @Column(name = "STD_CD2", nullable = true)
  @ExcelCellName("품목대분류")
  var stdCd2: String = _

  @Column(name = "STD_CD3", nullable = true)
  @ExcelCellName("품목중분류")
  var stdCd3: String = _

  @Column(name = "STD_CD4", nullable = true)
  @ExcelCellName("품목소분류")
  var stdCd4: String = _

  @Column(name = "ECO_TYPE", nullable = true)
  @ExcelCellName("친환경명품구분")
  var ecoType: String = _

  @Column(name = "SEARCH_KEY", nullable = true)
  @ExcelCellName("검색어")
  var searchKey: String = _

  @Column(name = "SALE_PRC")
  @ExcelCellName("시중가")
  var salePrc: Int = _

  @Column(name = "MALL_PRC")
  @ExcelCellName("판매가")
  var mallPrc: Int = _

  @Column(name = "SHIP_ADDR", nullable = true)
  @ExcelCellName("출고지주소")
  var shipAddr: String = _

  @Column(name = "ORIGIN", nullable = true)
  @ExcelCellName("원산지")
  var origin: String = _

  @Column(name = "ITEM_TYPE", nullable = true)
  @ExcelCellName("상품유형")
  var itemType: String = _

  @Column(name = "QUANTITY", nullable = true)
  @ExcelCellName("용량수량")
  var quantity: String = _

  @Column(name = "PRODUCER", nullable = true)
  @ExcelCellName("생산자")
  var producer: String = _

  @Column(name = "CREATE_PACK", nullable = true)
  @ExcelCellName("제조생산포장일")
  var createPack: String = _

  @Column(name = "EXPIRE", nullable = true)
  @ExcelCellName("유통기한")
  var expire: String = _

  @Column(name = "ITEM_COMPOSE", nullable = true)
  @ExcelCellName("상품구성")
  var itemCompose: String = _

  @Column(name = "STORE_HANDLE", nullable = true)
  @ExcelCellName("보관취급방법")
  var storeHandle: String = _

  @Column(name = "BUFFER1", nullable = true)
  @ExcelCellName("관련표시사항1")
  var buffer1: String = _

  @Column(name = "DELV_FEE")
  @ExcelCellName("배송비")
  var delvFee: Int = _

  @Column(name = "ITEM_OPTION" , nullable = true)
  @ExcelCellName("상품옵션")
  var itemOption: String = _

  @Column(name = "ITEM_IMG1" , nullable = true)
  @ExcelCellName("대표이미지주소")
  var itemImg1: String = _
}
