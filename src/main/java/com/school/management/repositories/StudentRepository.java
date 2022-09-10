package com.school.management.repositories;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.school.management.model.interfaces.People;
import com.school.management.model.student.Student;
import com.school.management.model.student.Students;

@Repository
public class StudentRepository implements DaoRepository {
	private static final Logger log = LoggerFactory.getLogger(StudentRepository.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public People getAll(String searchTerm) {
		log.info("fetching list of students");
		return new Students(jdbcTemplate.query(
				"select id, name, email, current_grade, date_of_birth from students;", 
					(rs, rowNum) -> new Student(
						rs.getInt("id"),
		                rs.getString("name"),
		                rs.getDate("date_of_birth"),
		                rs.getString("email"),
		                rs.getString("current_grade")
		        )));
	}
}
