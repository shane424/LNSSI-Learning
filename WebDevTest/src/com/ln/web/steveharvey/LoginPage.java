package com.ln.web.steveharvey;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ln.web.baselet.Baselet;
import com.ln.web.model.People;

/**
 * Servlet implementation class LoginPage
 */
public class LoginPage extends Baselet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		People[] Clones = {new People(1,"Happy",5,"<img src= \"images/emotions/Happy.jpg\" width=\"100\" height=\"100\" />"),
				new People(2,"Sad",14,"<img src= \"images/emotions/Sad.jpg\" width=\"100\" height=\"100\" />"),
				new People(3,"Upset",18,"<img src= \"images/emotions/Upset.jpg\" width=\"100\" height=\"100\" />"),
				new People(3,"Creepishly Happy",24,"<img src= \"images/emotions/Creepishly.jpg\" width=\"100\" height=\"100\" />"),
				new People(4,"Great",10,"<img src= \"images/emotions/Great.jpg\" width=\"100\" height=\"100\" />"),
				new People(5,"Brilliant",20,"<img src= \"images/emotions/Brilliant.jpg\" width=\"100\" height=\"100\" />"),
				new People(6,"Scared",17,"<img src= \"images/emotions/Scared.jpg\" width=\"100\" height=\"100\" />"),
				new People(7,"Terrified",18,"<img src= \"images/emotions/Terrified.png\" width=\"100\" height=100 />"),
				new People(8,"Glorious",60,"<img src= \"images/emotions/Glorious.jpg\" width=\"100\" height=\"100\" />"),
				new People(9,"Mad",30,"<img src= \"images/emotions/Mad.jpg\" width=\"100\" height=\"100\" />")
		};
		
		String expecFname = "Steve";
		String expecLname = "Harvey";
		String firstname = (String) request.getParameter("first_name");
		String lastname = (String) request.getParameter("last_name");
		boolean loggedIn = false;
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(expecFname);
		System.out.println(expecLname);
		request.setAttribute("myname", firstname + " " + lastname);
		if(firstname.equals(expecFname) && lastname.equals(expecLname))
		{
			System.out.println("in if statement");
			String[] steves = {"happy","sad","excited","disappointed","upset"};
			request.setAttribute("steves", steves);
			String[] pics = {
					"<img src= \"images/steve/myboysteveharvey.jpg\"/>",
					"<img src= \"images/steve/1.jpg\"/>",
					"<img src= \"images/steve/2.jpg\"/>",
					"<img src= \"images/steve/3.jpg\"/>",
					"<img src= \"images/steve/4.jpg\"/>",
					"<img src= \"images/steve/5.jpg\"/>",
					"<img src= \"images/steve/6.gif\"/>",
					"<img src= \"images/steve/7.jpg\"/>",
					"<img src= \"images/steve/8.jpg\"/>",
					"<img src= \"images/steve/9.gif\"/>"
			};
			request.setAttribute("clones", Clones);
			request.setAttribute("pics", pics);
			loggedIn = true;
			System.out.println("AFTER");
			//return;
		}
		else
		{
			System.out.println("in else statement");
			//return;
		}
		if(loggedIn) request.getRequestDispatcher("/WEB-INF/pages/Firstjsp.jsp").forward(request, response);
		else request.getRequestDispatcher("/WEB-INF/pages/LoginFail.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
