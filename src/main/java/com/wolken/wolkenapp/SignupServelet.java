package com.wolken.wolkenapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wolken.wolkenapp.dto.UserDTO;
import com.wolken.wolkenapp.service.UserService;
import com.wolken.wolkenapp.service.UserServiceImpl;

@WebServlet(urlPatterns="/signup" , loadOnStartup = +1)
public class SignupServelet extends HttpServlet{
	UserDTO userDTO=new UserDTO();
	UserService userService=new UserServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		userDTO.setId(Integer.parseInt(req.getParameter("user_id")));
		userDTO.setUserName(req.getParameter("user_name"));
		userDTO.setEmailId(req.getParameter("user_email"));
		userDTO.setPassword(req.getParameter("user_password"));
		userDTO.setAge(Integer.parseInt(req.getParameter("user_age")));
		userService.validateAndSave(userDTO);
		userService.getAll();
		PrintWriter printwriter=resp.getWriter();
		printwriter.print("Registration Successfull");
	}


}
