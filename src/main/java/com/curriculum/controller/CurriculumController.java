package com.curriculum.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.curriculum.model.Person;
import com.curriculum.model.PersonId;
import com.curriculum.services.CurriculimService;

@RestController
@RequestMapping(value = "/curriculum")
public class CurriculumController {

	@Autowired
	private CurriculimService curriculumService;

	@GetMapping(value = "/getperson", produces = "application/json")
	@ResponseStatus(value = HttpStatus.OK)
	public List<Person> getPerson() {
		List<Person> persons = curriculumService.getPerson();
		return persons;
	}

	@PostMapping(value = "/createperson", produces = "application/json")
	@ResponseStatus(value = HttpStatus.CREATED)
	public PersonId createPerson(@RequestBody Person person) {
		PersonId personId = curriculumService.createPerson(person);
		return personId;
	}

	@PutMapping(value = "/updateperson/{id}", produces = "application/json")
	@ResponseStatus(value = HttpStatus.OK)
	public Person updatePerson(@RequestBody Person person, @PathVariable("id") String id) {
		Person people = curriculumService.updatePerson(person, id);
		return people;
	}

	@DeleteMapping(value = "/deleteperson/{id}", produces = "application/json")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void deletePerson(@PathVariable("id") String id) {
		curriculumService.deletePerson(id);
	}

}
