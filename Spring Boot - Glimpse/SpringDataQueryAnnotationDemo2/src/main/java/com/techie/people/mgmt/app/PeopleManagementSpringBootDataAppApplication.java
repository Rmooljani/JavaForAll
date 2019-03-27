package com.techie.people.mgmt.app;

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
		getPersonInfoByLastName();
		getPersonInfoByFirstName_Email();
	}

	private void getPersonInfoByFirstName_Email() {
		List<Person> personList = peopleManagementService.getPersonInfoByFirstName_Email("Mark","mark.tw123@gmail.com");
        for (Person person : personList) {
			System.out.println(person);
		}	
	}

	private void getPersonInfoByLastName() {
		List<Person> personList = peopleManagementService.getPersonInfoByLastName("Saxena");
		for (Person person : personList) {
			System.out.println(person);
		}
	}
	
	
}
