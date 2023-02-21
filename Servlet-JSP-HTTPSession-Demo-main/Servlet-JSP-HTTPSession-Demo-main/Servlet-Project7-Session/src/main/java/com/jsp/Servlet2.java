package com.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet ("/servlet2")
public class Servlet2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String name = req.getParameter("name");
		
		HttpSession httpSession = req.getSession();
		
		String sname = (String) httpSession.getAttribute("sname");
		
		PrintWriter printWriter = res.getWriter();
		printWriter.print("<html><body><h1>" + "Welcome back " + sname + "</h1><body></html>");
		printWriter.print("<a href='servlet3'>Logout</a>");
	}
}