package com.techie.people.mgmt.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.techie.people.mgmt.app.entity.Person;

@Repository
public interface PeopleManagementDao extends CrudRepository<Person, Integer>{
	

}
