package com.school.management.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.school.management.model.Teacher;
import com.school.management.model.Teachers;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class TeacherServiceTest {

	@Mock
	PeopleService teacherService;
	
	@BeforeEach
	void setup() {
		List<Teacher> mockTeachers = new ArrayList<>();
		mockTeachers.add(new Teacher());
		
		Mockito.when(teacherService.getAllEntities("")).thenReturn(new Teachers(mockTeachers));
	}
	
	@Test
	void test() {
		assertTrue(teacherService.getAllEntities("").getPeople().size() > 0);
	}

}
