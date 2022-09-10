package com.school.management.repositories;

import com.school.management.model.interfaces.People;

public interface DaoRepository {

	People getAll(String searchTerm);

}