package com.ly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ly.domain.User;
import com.ly.service.UserServiceI;

/**
 * controller再次
 * 类注释
 * @author 刘阳阳
 *
 */
@Controller
public class UserController {
	
	@Autowired
	private UserServiceI userService;

	@RequestMapping(value="firstMVC",method=RequestMethod.GET)
	public ModelAndView helloWorld(){
		System.out.println("------->>>>springMVC");
		String viewname = "success";
		List<User> list = userService.getAllUser();
		ModelAndView modelAndView = new ModelAndView(viewname);
		modelAndView.addObject("user",list);
		return modelAndView;
	}
}
