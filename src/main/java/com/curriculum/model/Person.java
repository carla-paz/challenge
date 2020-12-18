package com.curriculum.model;

import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Document(collection = "person")
@Data
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private String id;

	private String firstName;

	private String lastName;

	private String job;

	private String city;

	private String country;

	private String email;

	private String phoneNumber;

	private List<Skills> skills;

	private List<Languages> languages;

	private List<WorkExperience> workExperience;

	private List<Education> education;

	private List<Challenges> challenges;

	private SocialMedia socialMedia;

	private Config config;

}
