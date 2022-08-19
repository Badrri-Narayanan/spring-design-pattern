package com.school.management.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.school.management.model.People;
import com.school.management.model.Teacher;
import com.school.management.model.Teachers;

@Repository
public class TeacherRepository implements DaoRepository {
	private static final Logger log = LoggerFactory.getLogger(TeacherRepository.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public People getAll(String searchTerm) {
		log.info("fetching list of teachers");
		return new Teachers(jdbcTemplate.query("select id, name, email, edu_qualification, years_of_exp from teachers;",
				(rs, rowNum) -> new Teacher(rs.getString("name"), rs.getString("edu_qualification"),
						rs.getString("email"), rs.getInt("years_of_exp"), rs.getInt("id"))));
	}
}
