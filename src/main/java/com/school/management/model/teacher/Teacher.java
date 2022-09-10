package com.school.management.model.teacher;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.school.management.model.interfaces.Person;

public class Teacher implements Person {
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("educational_qualification")
	private String educationalQualification;
	
	@JsonProperty("email")
	private String email;
	
	@JsonProperty("years_of_experience")
	private int yearsOfExperience;
	
	@JsonProperty("employee_number")
	private int employeeNumber;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEducationalQualification() {
		return educationalQualification;
	}
	public void setEducationalQualification(String educationalQualification) {
		this.educationalQualification = educationalQualification;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	
	public Teacher() {
	}
	public Teacher(String name, String educationalQualification, String email, int yearsOfExperience,
			int employeeNumber) {
		super();
		this.name = name;
		this.educationalQualification = educationalQualification;
		this.email = email;
		this.yearsOfExperience = yearsOfExperience;
		this.employeeNumber = employeeNumber;
	}
	
}
