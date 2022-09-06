package com.school.management.service;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.school.management.model.Student;
import com.school.management.model.Students;

@SpringBootTest
class StudentServiceTest {

    PeopleService studentService;
    
    @BeforeEach
    void setup() {
    	studentService = mock(PeopleService.class);
    	List<Student> mockStudents = new ArrayList<Student>();
    	mockStudents.add(new Student());
    	Mockito.when(studentService.getAllEntities("")).thenReturn(new Students(mockStudents));
    }

    @Test
    void getAllEntities() {
        assertTrue(studentService.getAllEntities("").getPeople().size() > 0);
    }
}