package com.riyavers.dto.employee;

import com.riyavers.entity.Branch;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmployeeResponseDTO {

	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private String contact;
	private Branch branch;
	
	

}
