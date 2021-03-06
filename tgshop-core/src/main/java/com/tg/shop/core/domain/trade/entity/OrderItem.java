package com.tg.shop.core.domain.trade.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OrderItem implements Serializable {
    /**
     * 表 id
     */
    private String orderItemId;

    /**
     * 订单id
     */
    private String orderId;

    /**
     * 区域id
     */
    private String areaId;

    /**
     * 商品id
     */
    private String goodsId;

    /**
     * 货号
     */
    private String goodsSn;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 商品sku id
     */
    private String skuId;

    /**
     * 商品编号
     */
    private String skuNo;

    /**
     * 商品规格属性
     */
    private String specInfo;

    /**
     * SKU名称
     */
    private String skuGoodsName;

    /**
     * 类目id
     */
    private String categoryId;

    /**
     * 类目名称
     */
    private String categoryName;

    /**
     * 品牌id
     */
    private String brandId;

    /**
     * 品牌名称
     */
    private String brandName;

    /**
     * 数量
     */
    private Integer goodsNum;

    /**
     * 商品单价
     */
    private BigDecimal goodsPrice;

    /**
     * 商品总价
     */
    private BigDecimal goodsPriceTotal;

    /**
     * 促销id
     */
    private String promotionId;

    /**
     * 促销类型(1直降，2满减)
     */
    private Integer promotionType;

    /**
     * 促销优惠金额
     */
    private BigDecimal promotionDiscount;

    /**
     * 实际支付单价
     */
    private BigDecimal payPrice;

    /**
     * 实际支付总价
     */
    private BigDecimal payPriceTotal;

    /**
     * 运费模版ID
     */
    private String shopFreightTemplateId;

    /**
     * 退款 0 否 1是
     */
    private Integer refund;

    /**
     * 退款状态
     */
    private Integer refundState;

    /**
     * 删除状态
     */
    private Integer isDel;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改人
     */
    private String modifier;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 版本号
     */
    private Integer version;

    private static final long serialVersionUID = 1L;
}