package com.ly.service;

import java.util.List;

import com.ly.domain.Orders;
import com.ly.domain.Userr;

public interface OrderServiceI {

	public List<Orders> findOrdersUserResultMap() throws Exception;
	
	public List<Orders> findOrdersAndOrderDetailResultMap() throws Exception;
	
}
