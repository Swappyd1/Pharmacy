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

@WebServlet("/AddCustomerController")
public class AddCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	BLManager bl = new BLManager();
	Customer c = new Customer();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String cname = request.getParameter("cname");
		String cphone = request.getParameter("cphone");
		

		c.setCname(cname);
		c.setCphone(cphone);

		bl.saveCustomer(c);

		out.println("<script type=\"text/javascript\">");
		out.println("alert('Customer Added Successfully...');");
		out.println("location='addcustomer.jsp';");
		out.println("</script>");
	}

}
