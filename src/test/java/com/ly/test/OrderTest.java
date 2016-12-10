package com.ly.test;

import java.util.Date;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ly.domain.User;
import com.ly.service.OrderServiceI;
import com.ly.service.UserServiceI;


@RunWith(SpringJUnit4ClassRunner.class)
//配置了@ContextConfiguration注解并使用该注解的locations属性指明spring和配置文件之后，
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class OrderTest {
	
	@Autowired
	private OrderServiceI orderService;
	
	
	@Test
	public void testFindAll() throws Exception{
		System.out.println(orderService.findOrdersUserResultMap());
	}
	
	@Test
	public void testfindOrdersAndOrderDetailResultMap() throws Exception{
		System.out.println(orderService.findOrdersAndOrderDetailResultMap());
	}
}
