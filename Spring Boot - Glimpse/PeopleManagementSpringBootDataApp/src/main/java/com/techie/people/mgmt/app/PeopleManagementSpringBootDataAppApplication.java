package com.techie.people.mgmt.app;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.techie.people.mgmt.app.entity.Person;
import com.techie.people.mgmt.app.service.PeopleManagementService;

@SpringBootApplication
public class PeopleManagementSpringBootDataAppApplication implements CommandLineRunner{

	@Autowired
	private PeopleManagementService peopleManagementService;
	public static void main(String[] args) {
		SpringApplication.run(PeopleManagementSpringBootDataAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		 createPerson();
         createPersons();
	   	 findPersonsByIds();
		 //deletePersonsByIds();
	     //deletePerson();
	   	updatePersonEmailById();
	}
	
	private void createPerson() {
		Person person = new Person("Tiya", "Saxena", "tiya.saxena@hmail.com", new Date());
		peopleManagementService.create(person);
		System.out.println(person.toString());
	}
	
	private void createPersons() {
		List<Person> listPerson = Arrays.asList(new Person("Tom", "Alter", "alter.tom450@yahoo.com", new Date()),
				new Person("Mark", "Twain", "mark.tw123@gmail.com", new Date()));
		peopleManagementService.createPersonList(listPerson);
		for(Person p :listPerson) {
			System.out.println(p.toString());
		}
	}
	
	private void findPersonsByIds() {
		List<Integer> listpersonId = Arrays.asList(24,25,26,27);
		Iterable<Person> personList = peopleManagementService.findPersonList(listpersonId);
		for (Person person : personList) {
			System.out.println(person);
		}
	}

	private void deletePersonsByIds() {
		List<Integer> listpersonId = Arrays.asList();
		 peopleManagementService.deletePersonList(listpersonId);
	}
	
	private void deletePerson() {
		Person person = new Person();
		person.setId(54);
		 peopleManagementService.deletePerson(person);
	}
	
	private void updatePersonEmailById() {
		peopleManagementService.updatePersonEmailByID(48,"alter.george8765@gmail.com");
	}
}
