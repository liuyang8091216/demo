package com.ly.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import com.ly.dao.OrdersMapper;
import com.ly.domain.Orders;
import com.ly.domain.Userr;
import com.ly.service.OrderServiceI;

@Service
public class OrderServiceImpl implements OrderServiceI {

	@Autowired
	private OrdersMapper orderMapper;
	
	public List<Orders> findOrdersUserResultMap() throws Exception {
		return orderMapper.findOrdersUserResultMap();
	}

	public List<Orders> findOrdersAndOrderDetailResultMap() throws Exception {
		return orderMapper.findOrdersAndOrderDetailResultMap();
	}
 
}
