package com.ln.web.login;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ln.db.DBUtils;
import com.ln.pojo.Person;

import com.ln.web.baselet.Baselet;
import com.ln.web.model.People;

/**
 * Servlet implementation class LoginPage
 */
public class LoginLogic extends Baselet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginLogic() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = (String) request.getParameter("first_name");
		String pass = (String) request.getParameter("last_name");
		List<Person> table = new ArrayList<Person>();
		DBUtils utils = new DBUtils();
		try {
			try {
				List<Person> rows = utils.getPeople();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			try {
				System.out.println("trying username");
				Person person = utils.getByUsername(username,pass);
				if(null != person){
					System.out.println(username);
					System.out.println(pass);
					request.setAttribute("table", utils.getUser(username));
					request.setAttribute("role", person.getRole());
					request.getRequestDispatcher("/WEB-INF/pages/Homepage.jsp").forward(request, response);
				}		
				//if(loggedIn) request.getRequestDispatcher("/WEB-INF/pages/Homepage.jsp").forward(request, response);
				else {
					System.out.println("else statement");
					request.getRequestDispatcher("/WEB-INF/pages/LoginFail.jsp").forward(request, response);
				}
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
