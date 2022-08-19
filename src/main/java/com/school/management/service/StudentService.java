package com.school.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.school.management.dao.DaoRepository;
import com.school.management.model.People;

@Service
public class StudentService implements PeopleService {
	
	@Autowired
	@Qualifier("studentRepository")
	DaoRepository studentRepository;
	
	@Override
	public People getAllEntities(String searchTerm) {
		return studentRepository.getAll(searchTerm);
	}

}
