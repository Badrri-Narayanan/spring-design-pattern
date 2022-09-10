package com.school.management.repositoryFactory;

import com.school.management.repositories.DaoRepository;

public interface AbstractDaoRepositoryFactory {
	DaoRepository getRepository(String modelName);
	boolean isValidModelName(String modelName);
}
