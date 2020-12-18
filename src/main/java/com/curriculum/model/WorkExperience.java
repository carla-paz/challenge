package com.curriculum.model;

import java.util.Date;
import lombok.Data;

@Data
public class WorkExperience {
	
	private String title;
	
	private String company;
	
	private Date from;
	
	private Date to;
	
	private Boolean current;
	
	private String description;
	
}
