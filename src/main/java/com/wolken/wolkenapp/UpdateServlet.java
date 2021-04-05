package com.wolken.wolkenapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wolken.wolkenapp.service.UserService;
import com.wolken.wolkenapp.service.UserServiceImpl;

@WebServlet(urlPatterns = "/updateaccount", loadOnStartup = +1)
public class UpdateServlet extends HttpServlet {
	UserService userService = new UserServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Integer id=Integer.parseInt(req.getParameter("user_id"));
		String userName1=req.getParameter("user_name1");
		userService.validateAndUpdate(id,userName1);
		
		
		
		
		  PrintWriter printwriter=resp.getWriter();
		  printwriter.print("Update  Successfully");
		  resp.setContentType("text/html");
		  printwriter.print("<html><head><title>Getting all details</title></head><body><a href='http://localhost:8080/form-hibernate/display?	'>back</a></body></html>");
		 

	}

}
