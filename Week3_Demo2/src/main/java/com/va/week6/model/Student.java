package com.va.week6.model;

import java.sql.Date;

/*
 * @author - each teammeber who wrote this has to write this..
 * @date -
 * Description - This is model class for student.. has firstname...
 * 
 */

public class Student {
	
	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	private String sid;
	private String age;
	private String gender;
	private String firstname;
	private String lastname;
	
	//private Date dt; 

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


}
