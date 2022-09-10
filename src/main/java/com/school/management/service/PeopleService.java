package com.school.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.management.exception.InvalidPeopleException;
import com.school.management.model.interfaces.People;
import com.school.management.repositoryFactory.AbstractDaoRepositoryFactory;

@Service
public class PeopleService implements IPeopleService {

	@Autowired
	AbstractDaoRepositoryFactory daoRepositoryFactory;

	@Override
	public People getAllEntities(String modelName, String searchTerm) throws Exception {
		// validate modelName
		validate(modelName);
		
		return daoRepositoryFactory.getRepository(modelName).getAll(searchTerm);
	}

	private void validate(String modelName) {
		if(!daoRepositoryFactory.isValidModelName(modelName)) {
			throw new InvalidPeopleException("Invalid model name");
		}
	}

}
