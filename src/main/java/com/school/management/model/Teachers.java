package com.school.management.model;

import java.util.ArrayList;
import java.util.List;

public class Teachers extends People {
	public Teachers(List<Teacher> teachers) {
		this.people = new ArrayList<Person>();
		
		for(Teacher teacher: teachers) {
			this.people.add(teacher);
		}
	}
}
