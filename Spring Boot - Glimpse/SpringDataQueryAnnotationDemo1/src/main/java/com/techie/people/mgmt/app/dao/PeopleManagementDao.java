package com.techie.people.mgmt.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.techie.people.mgmt.app.entity.Person;

public interface PeopleManagementDao extends Repository<Person, Integer>{
	
	@Query("select p from Person p where p.lastName=?1")
	List<Person> findByLastName(String lastName);

	@Query("select p from Person p where p.firstName=?1 AND p.email=?2")
	List<Person> findByFirstNameAndEmail(String firstName, String email);
	

}
