package com.studentmanagement.model;

import java.sql.Date;

public class Student {

	private String rollNum;
	private String Name;
	private String Gender;
	private String email;
	private Date DoB;
	private String ClgName;
	private String city;
	private double percentage;
	
	
	
	public Student(String rollNu,String name, String gender, String email, Date doB, String clgName, String city,
			double percentage) {
		super();
		rollNum=rollNu;
		Name = name;
		Gender = gender;
		this.email = email;
		DoB = doB;
		ClgName = clgName;
		this.city = city;
		this.percentage = percentage;
	}
	public String getRollNum() {
		return rollNum;
	}
	public void setRollNum(String rollNum) {
		this.rollNum = rollNum;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDoB() {
		return DoB;
	}
	public void setDoB(Date doB) {
		DoB = doB;
	}
	public String getClgName() {
		return ClgName;
	}
	public void setClgName(String clgName) {
		ClgName = clgName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [rollNum=" + rollNum + ", Name=" + Name + ", Gender=" + Gender + ", email=" + email + ", DoB="
				+ DoB + ", ClgName=" + ClgName + ", city=" + city + ", percentage=" + percentage + "]";
	}
	
	
	
}
