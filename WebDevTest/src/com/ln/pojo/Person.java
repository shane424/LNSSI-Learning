package com.ln.pojo;

public class Person {
	private int id;
	private String username;
	private String pass;
	private String name;
	private int age;
	private String role;
	private String class_name;
	private int class_grade;
	private String chapter;
	private int test_grade;
	
//	public Person(String user, String name, int age, String cn, int cg, String chap, int tg){
//		username = user;
//		this.name = name;
//		this.age = age;
//		class_name = cn;
//		class_grade = cg;
//		chapter = chap;
//		test_grade = tg;
//	}

	public Person(){
		//String name;
	}
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public String getClass_name() {
		return class_name;
	}


	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}


	public int getClass_grade() {
		return class_grade;
	}


	public void setClass_grade(int class_grade) {
		this.class_grade = class_grade;
	}


	public String getChapter() {
		return chapter;
	}


	public void setChapter(String chapter) {
		this.chapter = chapter;
	}


	public int getTest_grade() {
		return test_grade;
	}


	public void setTest_grade(int test_grade) {
		this.test_grade = test_grade;
	}


	public void getInfo(){
		// display values
		System.out.println("");
		System.out.print("Username: " + username + " ");
		System.out.print("name: " + name + " ");
		System.out.print("age: " + age + " ");
		System.out.print("role: " + role + " ");
		System.out.print("classes: " + class_name + " ");
		System.out.print("class_grade: " + class_grade + " ");
		System.out.print("tests: " + chapter);
		System.out.print("test_grade: " + test_grade + " ");
		System.out.println("");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " " + username + " " + name + " " + age + " " + role + " " + class_name
				+ " " + class_grade + " " + chapter + " " + test_grade;
	}
	
}
