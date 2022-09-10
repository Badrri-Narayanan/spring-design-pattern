package com.school.management.service;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.ArgumentMatchers.any;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.school.management.model.student.Student;
import com.school.management.model.teacher.Teacher;
import com.school.management.model.teacher.Teachers;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class PeopleServiceTest {
	
	@Mock
	IPeopleService peopleService;

	@BeforeEach
	void setup() {
		List<Student> mockStudents = new ArrayList<Student>();
		mockStudents.add(new Student());

		List<Teacher> mockTeachers = new ArrayList<>();
		mockTeachers.add(new Teacher());

		try {
			Mockito.when(peopleService.getAllEntities(any(), any())).thenReturn(new Teachers(mockTeachers));
		} catch(Exception e) {
			fail("unable to mock");
		}
	}

	@Test
	void test_students() {
		try {
			assertTrue(peopleService.getAllEntities("student", "").getPeople().size() > 0);
		} catch(Exception e) {
			fail("failed");
		}
	}

	@Test
	void test_teachers() {
		try {
			assertTrue(peopleService.getAllEntities("teacher", "").getPeople().size() > 0);
		} catch(Exception e) {
			fail("failed");
		}
	}
}
