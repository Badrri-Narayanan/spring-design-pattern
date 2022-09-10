package com.school.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.management.model.interfaces.People;
import com.school.management.service.IPeopleService;

@RestController
@RequestMapping("/api")
public class PeopleController {
	
	@Autowired
	IPeopleService peopleService;
	
	@GetMapping
	public String test() {
		return "server online";
	}
	
	@GetMapping("/{people}/all")
	public People getPeople(@PathVariable String people, String searchTerm) throws Exception {
		return peopleService.getAllEntities(people, searchTerm);
	}
}
