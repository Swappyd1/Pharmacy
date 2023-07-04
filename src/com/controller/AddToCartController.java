package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLManager;
import com.pojo.Cart;
import com.pojo.Customer;
import com.pojo.Stock;

@WebServlet("/AddToCartController")
public class AddToCartController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	BLManager bl = new BLManager();
	Stock s = new Stock();
	Customer c = new Customer();
	Cart c1 = new Cart();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String cname = request.getParameter("cname");
		String mname = request.getParameter("mname");
		int quantity1 = Integer.parseInt(request.getParameter("quantity"));
		double price = Double.valueOf(request.getParameter("price"));
		System.out.println(price);
		
		

		System.out.println(s.getQuantity());
		c = bl.searchbycustomername(cname);
		s = bl.searchbystockname(mname);
		/*s = bl.searchbystockprice(price);*/
		
		int total=(int) (quantity1*price);
		
		
		c1.setTotal(total);
		c1.setPrice(price);
		c1.setCustomer(c);
		c1.setSelectedmedicine(mname);
		c1.setSelectedquantity(quantity1);
		c1.setCustname(cname);

		int q1 = s.getQuantity();

		if (quantity1 < q1) {
			bl.addtocart(c1);

			int q2 = quantity1 - q1;
			s.setQuantity(quantity1);
			bl.updatestock(s);
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Medicine Added to Cart...');");
			out.println("location='sellmedicine.jsp';");
			out.println("</script>");
		}

		else {

			out.println("<script type=\"text/javascript\">");
			out.println("alert('Stock is not available...');");
			out.println("location='sellmedicine.jsp';");
			out.println("</script>");
		}

	}

}
