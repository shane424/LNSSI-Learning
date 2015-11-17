package com.ln.web.steveharvey;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ln.web.baselet.Baselet;

/**
 * Servlet implementation class Steve
 */
public class Steve extends Baselet {
	private static final long serialVersionUID = 1L;
	

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Steve() {
        super();
        System.out.println("Steves Super.");
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("In Main Method of STEVE");
		
		super.doGet(request, response);
		
		response.setContentType("text/html");
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().append("<br>HERES YA BOI, \n\tSTEVE HARVEEEYYYYYYYYYYYYYYYYYY");
		
		PrintWriter out = response.getWriter();
		String title = "Steve Harvey Boise";
	    String docType =
	    "<!doctype html public \"-//w3c//dtd html 4.0 " +
	    "transitional//en\">\n";
		out.println(docType + 
						"<html>\n" +
						"<head><title>" + title + "</title></head>\n" +
						"<body bgcolor=\"#f0f0f0\">\n" +
						"<h1 align=\"center\">" + title + "</h1>\n" + 
						"<u1>\n" + 
						"  <li><b>First Name</b>: " 
						+ request.getParameter("first_name") + "\n" +
						"  <li><b>Last Name</b>: "
						+ request.getParameter("last_name") + "\n" 
						+ "\n" 
						+ "\n" +
						"  <li><b>Math</b>: " +
						request.getParameter("maths") + "\n" +
						"  <li><b>Physics</b>: "
						+ request.getParameter("physics") + "\n"  +
						"  <li><b>Chemistry</b>: "
						+ request.getParameter("chemistry") + "\n"  +
						"</u1>\n"  +
						
						"<img src=\"images/steve/myboysteveharvey.jpg\"/>"+
						"<img src=\"images/steve/1.jpg\"/>"+
						"<img src=\"images/steve/2.jpg\"/>"+
						"<img src=\"images/steve/3.jpg\"/>"+
						"<img src=\"images/steve/4.jpg\"/>"+
						"<img src=\"images/steve/5.jpg\"/>"+
						"<img src=\"images/steve/6.gif\"/>"+
						"<img src=\"images/steve/7.jpg\"/>"+
						"<img src=\"images/steve/8.jpg\"/>"+
						"<img src=\"images/steve/9.gif\"/>"+
						
						"</body></html>");
						response.getWriter().append("pooooooooooo");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
