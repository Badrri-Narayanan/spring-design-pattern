package com.school.management.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.management.model.People;
import com.school.management.service.DefaultService;
import com.school.management.service.PeopleService;
import com.school.management.service.StudentService;
import com.school.management.service.TeacherService;

@RestController
@RequestMapping("/api")
public class PeopleController {
	private static Map<String, PeopleService> services;
	
	@Autowired
	StudentService studentService;
	@Autowired
	TeacherService teacherService;
	
	@GetMapping
	public String test() {
		return "server online";
	}
	
	@PostConstruct
	public void registerServices() {
		services = new HashMap<String, PeopleService>();
		services.put("student", studentService);
		services.put("teacher", teacherService);
	}
	
	@GetMapping("/{people}/all")
	public People getPeople(@PathVariable String people, String searchTerm) {
		return services.getOrDefault(people, new DefaultService()).getAllEntities(searchTerm);
	}
}
