package com.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/servlet3")
public class Servlet3 extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		HttpSession httpSession = req.getSession();
		httpSession.removeAttribute("sname");
		httpSession.invalidate();
		
		PrintWriter printWriter = res.getWriter();
		printWriter.print("<html><body><h1>" + "Successfuly Logged Out" + "</h1><body></html>");
	}
}