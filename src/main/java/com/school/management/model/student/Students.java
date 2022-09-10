package com.school.management.model.student;

import java.util.ArrayList;
import java.util.List;

import com.school.management.model.interfaces.People;
import com.school.management.model.interfaces.Person;

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
