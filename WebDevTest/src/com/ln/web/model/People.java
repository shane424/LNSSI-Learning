package com.ln.web.model;

public class People {

	private int clone_number;
	private String emotion;
	private int age;
	private String img;
	
	public People(int num, String emo, int age, String img){
		this.clone_number = num;
		this.emotion = emo;
		this.age = age;
		this.img = img;
	}
	
	public int getClone_number() {
		return clone_number;
	}
	public void setClone_number(int clone_number) {
		this.clone_number = clone_number;
	}
	public String getEmotion() {
		return emotion;
	}
	public void setEmotion(String emotion) {
		this.emotion = emotion;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

}
