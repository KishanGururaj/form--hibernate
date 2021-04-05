package com.wolken.wolkenapp;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wolken.wolkenapp.dto.UserDTO;
import com.wolken.wolkenapp.service.UserService;
import com.wolken.wolkenapp.service.UserServiceImpl;
@WebServlet(urlPatterns = "/display",loadOnStartup = +1)
public class GetAllServlet extends HttpServlet {
	UserService userService =new UserServiceImpl();

	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("inside sevrlet");
		List<UserDTO>dtos =userService.getAll();
		//dtos.forEach(System.out::println);
		req.setAttribute("userList", dtos);
		RequestDispatcher dispatcher=req.getRequestDispatcher("getall.jsp");
		dispatcher.forward(req, resp);
	}

}
