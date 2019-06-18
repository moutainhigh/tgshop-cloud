package com.tg.shop.auth.mapper;

import com.tg.shop.core.domain.auth.entity.PlatformRoleMenu;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PlatformRoleMenuMapper {
    /**
     *
     * @mbg.generated Tue Apr 16 17:57:16 CST 2019
     */
    int deleteByPrimaryKey(String roleMenuId);

    /**
     *
     * @mbg.generated Tue Apr 16 17:57:16 CST 2019
     */
    int insert(PlatformRoleMenu record);

    /**
     *
     * @mbg.generated Tue Apr 16 17:57:16 CST 2019
     */
    int insertSelective(PlatformRoleMenu record);

    /**
     *
     * @mbg.generated Tue Apr 16 17:57:16 CST 2019
     */
    PlatformRoleMenu selectByPrimaryKey(String roleMenuId);

    /**
     *
     * @mbg.generated Tue Apr 16 17:57:16 CST 2019
     */
    int updateByPrimaryKeySelective(PlatformRoleMenu record);

    /**
     *
     * @mbg.generated Tue Apr 16 17:57:16 CST 2019
     */
    int updateByPrimaryKey(PlatformRoleMenu record);
}