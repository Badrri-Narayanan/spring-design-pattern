package com.school.management.repositoryFactory;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.school.management.repositories.DaoRepository;

@Service
public class DaoRepositoryFactory implements AbstractDaoRepositoryFactory {
	private static Map<String, DaoRepository> repositories;
	
	@Autowired
	@Qualifier("studentRepository")
	DaoRepository studentRepository;
	
	@Autowired
	@Qualifier("teacherRepository")
	DaoRepository teacherRepository;
	
	@PostConstruct
	private void registerRepositories() {
		repositories = new HashMap<>();
		repositories.put("student", studentRepository);
		repositories.put("teacher", teacherRepository);
	}

	@Override
	public DaoRepository getRepository(String modelName) {
		return repositories.get(modelName);
	}

	@Override
	public boolean isValidModelName(String modelName) {
		return repositories.containsKey(modelName);
	}

}
