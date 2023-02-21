package com.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet ("/servlet1")
public class Servlet1 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("sname", name);
		
		PrintWriter printWriter = response.getWriter();
		printWriter.print("<html><body><h1>" + "Welcome " + name + "</h1><body></html>");
		printWriter.print("<a href='servlet2'> Go to second servlet </a>");
	}
}