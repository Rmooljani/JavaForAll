package com.techie.people.mgmt.app.dao;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.techie.people.mgmt.app.entity.Person;

public interface PeopleManagementDao extends Repository<Person, Integer>{
	
	List<Person> findByLastName(String lastName);

	List<Person> findByFirstNameAndEmail(String firstName, String email);
	

}
