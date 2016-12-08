package com.ly.dao;

import java.util.List;

import com.ly.domain.User;

/**
 * 这是dao层
 * @author 刘阳阳
 *
 */
public interface UserMapper {
    int deleteByPrimaryKey(String userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    List<User> getAllUser();
}