package com.ln.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.ln.pojo.Person;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class DBUtils {
	private Connection getConnection() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException{
		// connect
		// String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		String DB_URL = "jdbc:mysql://localhost/testDB";
		// credentials
		String USER = "root";
		String PASS = "Summer2015";
		
		Connection conn = null;
	
		conn = DriverManager.getConnection(DB_URL + "?user=" + USER + "&password=" + PASS);
		return conn;
	}

	public List<Person> getPeople() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		Connection conn = getConnection();
		Statement stmt = null;
		List<Person> table = new ArrayList<Person>();
		System.out.println("Creating statement...");
		stmt = conn.createStatement();
		String sql = "select p.person_id, p.username, p.password, i.name, i.age, i.role, c.class, c.class_grade, t.chapter, t.test_grade "
				+ "from testDB.Person  p " + "join testDB.Person_info i " + "on p.person_id = i.person_id "
				+ " join testDB.Class c " + "on i.info_id = c.info_id " + "join testDB.Tests t "
				+ "on c.class_id = t.class_id";
		ResultSet rs = stmt.executeQuery(sql);
		Person per = null;

		while (rs.next()) {
			per = new Person();
			// retrieve column name
			per.setId(rs.getInt("person_id"));
			per.setUsername(rs.getString("username"));
			per.setPass(rs.getString("password"));
			per.setName(rs.getString("name"));
			per.setAge(rs.getInt("age"));
			per.setRole(rs.getString("role"));
			per.setClass_name(rs.getString("class"));
			per.setClass_grade(rs.getInt("class_grade"));
			per.setChapter(rs.getString("chapter"));
			per.setTest_grade(rs.getInt("test_grade"));
			// // display values

			table.add(per);
		}
		rs.close();
		conn.close();

		for (Person p : table) {
			System.out.println(p.toString());
		}

		// Do something with the Connection

		return table;
	}
	public List<Person> getNamefromID(int id) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException{
		List<Person> table = getPeople();
		List<Person> per = new ArrayList<Person>();
		for(Person p : table){
			if(p.getId() == id) per.add(p);
		}
		return per;
	}
	
	public List<Person> getUser(String user) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException{
		List<Person> table = getPeople();
		List<Person> per = new ArrayList<Person>();
		for(Person p : table){
			if(p.getUsername().equals(user)){
				if(p.getRole().equals("teacher")){
					for(Person p1 : table){
						per.add(p1);
					}
					return per;
				}
				per.add(p);
			}
		}
		return per;
	}
	
	public Person getByUsername(String un, String pw) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException{
		List<Person> table = getPeople();
		List<Person> per = new ArrayList<Person>();
		for(Person p : table){
			System.out.println("password");
			System.out.println(p.getPass());
			if(p.getUsername().equals(un)){
				if(p.getPass().equals(pw)){
					System.out.println(pw);
					return p;
				}
			}
		}
		return null;
	}
}
