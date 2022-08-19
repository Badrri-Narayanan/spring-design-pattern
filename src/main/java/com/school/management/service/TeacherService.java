package com.school.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.school.management.dao.DaoRepository;
import com.school.management.model.People;

@Service
public class TeacherService implements PeopleService {

	@Autowired
	@Qualifier("teacherRepository")
	DaoRepository teacherRepository;
	
	@Override
	public People getAllEntities(String searchTerm) {
		return teacherRepository.getAll(searchTerm);
	}

}
