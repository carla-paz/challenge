package com.curriculum.services;

import java.util.List;
import com.curriculum.model.Person;
import com.curriculum.model.PersonId;

public interface CurriculimService {

	public List<Person> getPerson();

	public PersonId createPerson(Person person);

	public Person deletePerson(String id);

	public Person updatePerson(Person person, String id);

}
