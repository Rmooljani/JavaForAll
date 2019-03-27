package com.techie.people.mgmt.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.techie.people.mgmt.app.entity.Person;

public interface PeopleManagementDao extends Repository<Person, Integer>{
	
	@Query(value="SELECT *FROM people_management WHERE last_name=?1",nativeQuery=true)
	List<Person> findByLastName(String lastName);

	@Query(value="SELECT *FROM people_management WHERE first_name=?1 AND email=?2",nativeQuery=true)
	List<Person> findByFirstNameAndEmail(String firstName, String email);
	

}
