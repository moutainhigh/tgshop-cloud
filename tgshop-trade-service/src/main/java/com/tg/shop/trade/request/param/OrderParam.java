package com.tg.shop.trade.request.param;

import com.tg.shop.core.domain.trade.entity.Cart;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 保存订单参数
 * @author Administrator
 */
@Data
@NoArgsConstructor
@ToString
public class OrderParam {


    /**
     * 订单id
     */
    private String orderId;

    /**
     * 订单编号
     */
    private String orderSn;

    /**
     * 父订单id  0未拆单，1为父订单，其它为父订单ID
     */
    private String parentId;

    /**
     * 父订单编号
     */
    private String parentOrderSn;

    /**
     * 订单来源编码
     */
    private String originOrderSn;

    /**
     * 买家id
     */
    private String buyerId;

    /**
     * 买家姓名
     */
    private String buyerName;

    /**
     * 买家电话
     */
    private String buyerMobile;

    /**
     * 卖家id
     */
    private String sellerId;

    /**
     * 店铺id
     */
    private String storeId;

    /**
     * 订单状态 1 待付款 2. 待发货 3 待收货  6 已完成 0 已取消
     */
    private Integer orderState;

    /**
     * 商品总金额
     */
    private BigDecimal goodsAmount;

    /**
     * 运费
     */
    private BigDecimal freightCharge;

    /**
     * 优惠券id
     */
    private String promoId;

    /**
     * 优惠金额
     */
    private BigDecimal promoDiscount;

    /**
     * 积分数量
     */
    private Integer integralNum;

    /**
     * 积分优惠金额
     */
    private BigDecimal integralDiscount;

    /**
     * 调价金额
     */
    private BigDecimal adjustAmount;

    /**
     * 调价时间
     */
    private Date changePaymentPriceTime;

    /**
     * 调价操作员
     */
    private String changePaymentPriceOperator;

    /**
     * 总优惠价
     */
    private BigDecimal totalDiscount;

    /**
     * 订单总价
     */
    private BigDecimal totalPrice;

    /**
     * 交易对外编号
     */
    private String tradeOutSn;

    /**
     * 交易流水号
     */
    private String tradeSn;

    /**
     * 实际支付金额
     */
    private BigDecimal paymentPrice;

    /**
     * 货到付款 0 否 1 是
     */
    private Integer payRecive;

    /**
     * 支付状态 0 未付款 1 已付款
     */
    private Integer paymentState;

    /**
     * 支付类型 1 支付宝 2 微信 3 积分 4 银联
     */
    private Integer paymentType;

    /**
     * 支付时间
     */
    private Date paymentTime;

    /**
     * 是否有发票 0 否 1是
     */
    private Integer invoiceNeed;

    /**
     * 发票标题
     */
    private String invoiceTitle;

    /**
     * 发票税号
     */
    private String invoiceCorporationTax;

    /**
     * 收货人
     */
    private String addressReciverName;

    /**
     * 收货电话
     */
    private String addressReciverMobile;

    /**
     * 邮编
     */
    private String addressZipCode;

    /**
     * 省份
     */
    private String addressProvince;

    /**
     * 城市
     */
    private String addressCity;

    /**
     * 县市区
     */
    private String addressCounty;

    /**
     * 详细收货地址
     */
    private String addressDetailAddress;

    /**
     * 物流公司
     */
    private String logisticsCompany;

    /**
     * 物流公司编号
     */
    private String logisticsCompanyCode;

    /**
     * 物流单号
     */
    private String logisticsNo;

    /**
     * 物流备注
     */
    private String logisticsRemark;

    /**
     * 订单备注
     */
    private String orderRemark;

    /**
     * 卖家备注
     */
    private String sellerRemark;



    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 购物车 购买商品
     */
    private List<Cart> cartList;


}