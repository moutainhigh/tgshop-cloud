package com.tg.shop.auth.mapper;

import com.tg.shop.core.domain.auth.entity.StoreRoleMenu;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StoreRoleMenuMapper {
    /**
     *
     * @mbg.generated Tue Jun 25 14:49:57 CST 2019
     */
    int deleteByPrimaryKey(String roleMenuId);

    /**
     *
     * @mbg.generated Tue Jun 25 14:49:57 CST 2019
     */
    int insert(StoreRoleMenu record);

    /**
     *
     * @mbg.generated Tue Jun 25 14:49:57 CST 2019
     */
    int insertSelective(StoreRoleMenu record);

    /**
     *
     * @mbg.generated Tue Jun 25 14:49:57 CST 2019
     */
    StoreRoleMenu selectByPrimaryKey(String roleMenuId);

    /**
     *
     * @mbg.generated Tue Jun 25 14:49:57 CST 2019
     */
    int updateByPrimaryKeySelective(StoreRoleMenu record);

    /**
     *
     * @mbg.generated Tue Jun 25 14:49:57 CST 2019
     */
    int updateByPrimaryKey(StoreRoleMenu record);
}