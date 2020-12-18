package com.curriculum.model;

import java.util.Date;
import lombok.Data;

@Data
public class Education {

	private String name;

	private String career;

	private Date from;

	private Date to;
	
	private String degree;

}
