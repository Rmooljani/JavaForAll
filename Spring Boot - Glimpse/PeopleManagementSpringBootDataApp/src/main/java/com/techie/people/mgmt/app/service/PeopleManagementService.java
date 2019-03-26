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
	
	public Person create(Person person) {
		return peopleManagementDao.save(person);
	}

	public Iterable<Person> createPersonList(List<Person> listPerson) {
		Iterable<Person> itrablePerson = peopleManagementDao.saveAll(listPerson);
		return itrablePerson;
	}
	
	public Iterable<Person> findPersonList(List<Integer> listPersonId){
		Iterable<Person> itrablePersonIds = peopleManagementDao.findAll();
		return itrablePersonIds;
	}

	public void deletePersonList(List<Integer> listpersonId) {
		peopleManagementDao.deleteAll();
	}

	public void deletePerson(Person person) {
		peopleManagementDao.delete(person);
	}

	public void updatePersonEmailByID(int id, String newEmail) {
		Optional<Person> person = peopleManagementDao.findById(48);
		if(id==person.get().getId()) {
			person.get().setEmail(newEmail);
		}
		peopleManagementDao.save(person.get());
	}

}
