package com.school.management.model.teacher;

import java.util.ArrayList;
import java.util.List;

import com.school.management.model.interfaces.People;
import com.school.management.model.interfaces.Person;

public class Teachers extends People {
	public Teachers(List<Teacher> teachers) {
		this.people = new ArrayList<Person>();
		
		for(Teacher teacher: teachers) {
			this.people.add(teacher);
		}
	}
}
