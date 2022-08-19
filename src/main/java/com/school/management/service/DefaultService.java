package com.school.management.service;

import com.school.management.exception.InvalidPeopleException;
import com.school.management.model.People;

public class DefaultService implements PeopleService {

	@Override
	public People getAllEntities(String searchTerm) {
		throw new InvalidPeopleException("Invalid Input");
	}

}
