package com.school.management.model;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student implements Person {
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("date_of_birth")
	private Date dateOfBirth;
	
	@JsonProperty("roll_number")
	private int rollNumber;
	
	@JsonProperty("email")
	private String email;
	
	@JsonProperty("current_grade")
	private String currentGrade;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCurrentGrade() {
		return currentGrade;
	}
	public void setCurrentGrade(String currentGrade) {
		this.currentGrade = currentGrade;
	}
	public Student() {
	}
	public Student(int rollNumber, String name, Date dateOfBirth, String email, String currentGrade) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.rollNumber = rollNumber;
		this.email = email;
		this.currentGrade = currentGrade;
	}
}
