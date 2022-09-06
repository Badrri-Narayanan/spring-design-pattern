package com.school.management.service;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.school.management.model.Teacher;
import com.school.management.model.Teachers;

class TeacherServiceTest {

	PeopleService teacherService;
	
	@BeforeEach
	void setup() {
		teacherService = mock(PeopleService.class);
		List<Teacher> mockTeachers = new ArrayList<>();
		mockTeachers.add(new Teacher());
		
		Mockito.when(teacherService.getAllEntities("")).thenReturn(new Teachers(mockTeachers));
	}
	
	@Test
	void test() {
		assertTrue(teacherService.getAllEntities("").getPeople().size() > 0);
	}

}
