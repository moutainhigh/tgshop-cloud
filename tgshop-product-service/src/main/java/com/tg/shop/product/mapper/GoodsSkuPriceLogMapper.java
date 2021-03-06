package com.tg.shop.product.mapper;

import com.tg.shop.core.domain.product.entity.GoodsSkuPriceLog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodsSkuPriceLogMapper {
    /**
     *
     * @mbg.generated Sun Jul 28 18:41:38 CST 2019
     */
    int deleteByPrimaryKey(String tbId);

    /**
     *
     * @mbg.generated Sun Jul 28 18:41:38 CST 2019
     */
    int insert(GoodsSkuPriceLog record);

    /**
     *
     * @mbg.generated Sun Jul 28 18:41:38 CST 2019
     */
    int insertSelective(GoodsSkuPriceLog record);

    /**
     *
     * @mbg.generated Sun Jul 28 18:41:38 CST 2019
     */
    GoodsSkuPriceLog selectByPrimaryKey(String tbId);

    /**
     *
     * @mbg.generated Sun Jul 28 18:41:38 CST 2019
     */
    int updateByPrimaryKeySelective(GoodsSkuPriceLog record);

    /**
     *
     * @mbg.generated Sun Jul 28 18:41:38 CST 2019
     */
    int updateByPrimaryKey(GoodsSkuPriceLog record);
}