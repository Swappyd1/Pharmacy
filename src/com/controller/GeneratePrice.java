package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLManager;
import com.pojo.Customer;
import com.pojo.Stock;

@WebServlet("/GeneratePrice")
public class GeneratePrice extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	BLManager bl=new BLManager();
	Customer c=new Customer();
	Stock s=new Stock();
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String cname = request.getParameter("cname");
		String mname = request.getParameter("mname");
		
		
	}

}
