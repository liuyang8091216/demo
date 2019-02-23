package com.ly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ly.domain.Orders;
import com.ly.domain.User;
import com.ly.service.OrderServiceI;
import com.ly.service.UserServiceI;

/**
 * controller再次
 * 类注释
 * 在更新一点点吧
 * @author 刘阳阳
 *
 */
@RequestMapping("order_")
@Controller
public class OrderController {
	
	@Autowired
	private OrderServiceI orderService;

	@RequestMapping(value="findfindOrdersUserResultMap",method=RequestMethod.GET)
	public ModelAndView findfindOrdersUserResultMap() throws Exception{
		String viewname = "orderUser";
		List<Orders> orders = orderService.findOrdersUserResultMap();
		ModelAndView modelAndView = new ModelAndView(viewname);
		modelAndView.addObject("orders", orders);
		return modelAndView;
	}

	@RequestMapping(value="abc",method=RequestMethod.GET)
	public String hello() throws Exception{
		System.out.println("hello world!ua乱码吗");
		String viewname = "orderUser";
		return viewname;
	}


}
