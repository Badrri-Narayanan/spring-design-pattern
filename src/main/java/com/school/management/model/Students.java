package com.school.management.model;

import java.util.ArrayList;
import java.util.List;

public class Students extends People {
	public Students() {
	}
	
	public Students(List<Student> students) {
		this.people = new ArrayList<Person>();
		
		for(Student student: students) {
			this.people.add(student);
		}
	}
}
