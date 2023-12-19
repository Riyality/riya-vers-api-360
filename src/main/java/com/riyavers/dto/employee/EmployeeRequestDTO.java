package com.riyavers.dto.employee;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmployeeRequestDTO {

	private String firstName;
	private String lastName;
	private String email;
	private String contact;
	private int branchId;

}
