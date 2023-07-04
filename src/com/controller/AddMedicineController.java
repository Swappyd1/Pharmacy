package com.controller;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLManager;
import com.pojo.Stock;

@WebServlet("/AddMedicineController")
public class AddMedicineController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	BLManager bl = new BLManager();
	Stock s = new Stock();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String mcompany = request.getParameter("mcompany");
		String mname = request.getParameter("mname");
		String mdescription = request.getParameter("mdescription");
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		double price = Double.valueOf(request.getParameter("price"));
		String mdate = request.getParameter("mdate");
		String edate = request.getParameter("edate");
		System.out.println(mcompany);

		s.setMcompany(mcompany);
		s.setMname(mname);
		s.setMdescription(mdescription);
		s.setQuantity(quantity);
		s.setPrice(price);
		s.setMdate(mdate);
		s.setEdate(edate);

		bl.savemedicine(s);

		out.println("<script type=\"text/javascript\">");
		out.println("alert('Medicine Added Successfully...');");
		out.println("location='addmedicine.jsp';");
		out.println("</script>");

	}

}