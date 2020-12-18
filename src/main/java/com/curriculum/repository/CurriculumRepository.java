package com.curriculum.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.curriculum.model.Person;

@Repository
public interface CurriculumRepository extends MongoRepository<Person, String> {

}
