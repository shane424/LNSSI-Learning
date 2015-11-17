package com.ln.web.baselet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class baselet
 */
public class Baselet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Baselet() {
        super();
    	System.out.println("Baselet Super.");
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		response.setContentType("text/html");
		System.out.println("in Base servlet");
		System.out.println(request.getRemoteAddr());
		
//		PrintWriter out = response.getWriter();
//		String title = "Steve Harvey Boise";
//	    String docType =
//	    "<!doctype html public \"-//w3c//dtd html 4.0 " +
//	    "transitional//en\">\n";
//		out.println(docType + 
//						"<html>\n" +
//						"<head><title>" + title + "</title></head>\n" +
//						"<body bgcolor=\"#f0f0f0\">\n" +
//						"<h1 align=\"center\">" + title + "</h1>\n" + 
//						"<u1>\n" + 
//						"  <li><b>First Name</b>: " 
//						+ request.getParameter("first_name") + "\n" +
//						"  <li><b>Last Name</b>: "
//						+ request.getParameter("last_name") + "\n" 
//						+ "\n" 
//						+ "\n" +
//						"  <li><b>Math</b>: " +
//						request.getParameter("maths") + "\n" +
//						"  <li><b>Physics</b>: "
//						+ request.getParameter("physics") + "\n"  +
//						"  <li><b>Chemistry</b>: "
//						+ request.getParameter("chemistry") + "\n"  +
//						"</u1>\n"  +
//						
//						"<img src=\"images/sw/boba.jpg\"/>"+
//						"<img src=\"images/sw/darth.jpg\"/>"+
//						"<img src=\"images/sw/stdate.jpg\"/>"+
//						
//						"</body></html>");
//						response.getWriter().append("pooooooooooo");
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
