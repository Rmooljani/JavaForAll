package com.techie.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

import com.techie.model.Person;

public class ReferenceToInstanceMethodInLambda {
	
	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<>();
		
		persons.add(new Person("Martin", 22));
		persons.add(new Person("John", 54));
		persons.add(new Person("Alisa", 32));
		persons.add(new Person("Bob", 65));
		persons.add(new Person("Charlie", 13));
		
		List<String> personNames = ReferenceToInstanceMethodInLambda.getPersonNames(persons,Person::getName);
		personNames.forEach(System.out::println);
	}
	
	private static List<String> getPersonNames(List<Person> persons,Function<Person, String> f){
		
		Iterator<Person> names = persons.iterator();
		while(names.hasNext()) {
			System.out.println(names.next());
		}
		
		List<String> result = new ArrayList<>();
		persons.forEach(n->result.add(f.apply(n)));
		return result;
		
	}

}
