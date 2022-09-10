package com.school.management.service;

import com.school.management.model.interfaces.People;

public interface IPeopleService {
	public People getAllEntities(String modelName, String searchTerm) throws Exception;
}
