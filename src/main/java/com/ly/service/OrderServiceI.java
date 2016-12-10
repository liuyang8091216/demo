package com.ly.service;

import java.util.List;

import com.ly.domain.Orders;
import com.ly.domain.Userr;

public interface OrderServiceI {

	List<Orders> findOrdersUserResultMap() throws Exception;
	
}
