package com.ly.dao;

import java.util.List;

import com.ly.domain.Orders;

public interface OrdersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
    
    public List<Orders> findOrdersUserResultMap() throws Exception;
    
    public List<Orders> findOrdersAndOrderDetailResultMap() throws Exception;
}