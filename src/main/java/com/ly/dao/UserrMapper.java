package com.ly.dao;

import com.ly.domain.Userr;

public interface UserrMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Userr record);

    int insertSelective(Userr record);

    Userr selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Userr record);

    int updateByPrimaryKey(Userr record);
}