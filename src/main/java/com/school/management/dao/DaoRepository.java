package com.school.management.dao;

import com.school.management.model.People;

public interface DaoRepository {

	People getAll(String searchTerm);

}