package com.ln.db;

import java.sql.SQLException;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ln.pojo.Person;

public class DBTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testrows() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		DBUtils utils = new DBUtils();
		List<Person> rows = utils.getPeople();
		
		Assert.assertEquals(7,rows.size());
	}
	
	@Test
	public void testID() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		DBUtils utils = new DBUtils();
		List<Person> rows = utils.getPeople();
	    int wantedID = 3;
	    System.out.println(utils.getNamefromID(wantedID));
		Assert.assertNotNull(utils.getNamefromID(wantedID));
	}

	@Test
	public void testUsername() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		DBUtils utils = new DBUtils();
		List<Person> rows = utils.getPeople();
	    String un = "human two";
	    System.out.println(utils.getByUsername(un, "two"));
		Assert.assertNotNull(utils.getByUsername(un, "two"));
	}
	// select person
	// get recordset, wrap it in java POJOs(plain old java object)
	// iterate over POJOS, print out in console
	// close connection
}
