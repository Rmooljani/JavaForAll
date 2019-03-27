package com.techie.people.mgmt.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techie.people.mgmt.app.dao.PeopleManagementDao;
import com.techie.people.mgmt.app.entity.Person;

@Service
public class PeopleManagementService {
	
	@Autowired
	private PeopleManagementDao peopleManagementDao;
	
	public List<Person> getPersonInfoByLastName(String lastName) {
		return peopleManagementDao.findByLastName(lastName);
	}

	public List<Person> getPersonInfoByFirstName_Email(String firstName, String email) {
		return peopleManagementDao.findByFirstNameAndEmail(firstName,email);
	}

}
