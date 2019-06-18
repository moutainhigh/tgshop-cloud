package com.tg.shop.core.domain.product.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class GoodsInventory implements Serializable {
    /**
     * 库存id (= skuId)
     */
    private String inventoryId;

    /**
     * 区域id
     */
    private String areaId;

    /**
     * 店铺
     */
    private String storeId;

    /**
     * 卖家id
     */
    private String sellerId;

    /**
     * 商品编号
     */
    private String sku;

    /**
     * 库存数量
     */
    private Integer inventoryNum;

    /**
     * 锁定数量
     */
    private Integer lockNum;

    /**
     * 可用数量
     */
    private Integer leftNum;

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

    /**
     * 备注
     */
    private String remark;

    private static final long serialVersionUID = 1L;
}