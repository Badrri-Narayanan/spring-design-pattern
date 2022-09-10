package com.school.management.model.interfaces;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class People {
	@JsonProperty("data")
	public List<Person> people;

	public List<Person> getPeople() {
		return people;
	}

	public void setPeople(List<Person> people) {
		this.people = people;
	}
}
