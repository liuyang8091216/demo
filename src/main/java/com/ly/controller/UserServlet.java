package com.ly.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.ly.domain.User;
import com.ly.service.UserServiceI;
import com.ly.service.impl.UserServiceImpl;

/**
 * 添加第二个类注释
 * @author 刘阳阳
 *
 */
public class UserServlet extends HttpServlet{

	private UserServiceI userService;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("------->>>>原生servlet");
		System.out.println(userService);
		List<User> list = userService.getAllUser();
		System.out.println(list);
		request.setAttribute("user", list);
		request.getRequestDispatcher("/success.jsp").forward(request, response);
	}
	
	public void init() throws ServletException {
        //在Servlet初始化时获取Spring上下文对象(ApplicationContext)
        ApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
        //从ApplicationContext中获取userService
        userService = (UserServiceI) ac.getBean("userService");
    }
}
