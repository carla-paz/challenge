package com.curriculum.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.curriculum.model.Person;
import com.curriculum.model.PersonId;
import com.curriculum.repository.CurriculumRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CurriculumServiceimpl implements CurriculimService {

	@Autowired
	private CurriculumRepository curriculumRepository;

	@Override
	public List<Person> getPerson() {
		log.info("Sucessfully from mongoDB");
		List<Person> persons = curriculumRepository.findAll();
		return persons;
	}

	@Override
	public PersonId createPerson(Person person) {
		String personIdDb = curriculumRepository.save(person).getId();
		log.info("Created sucessfully on mongoDB");
		PersonId personId = new PersonId();
		personId.setId(personIdDb);
		return personId;
	}

	@Override
	public Person deletePerson(String id) {
		if (curriculumRepository.existsById(id)) {
			curriculumRepository.deleteById(id);
		}
		return null;
	}

	@Override
	public Person updatePerson(Person person, String id) {
		person.setId(id);
		Person personUpdated = curriculumRepository.save(person);
		return personUpdated;
	}

}
