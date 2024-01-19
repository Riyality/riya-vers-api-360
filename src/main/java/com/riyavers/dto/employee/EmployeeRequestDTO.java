package com.riyavers.dto.employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRequestDTO {
    private int id=0;
	private String firstName;
	private String lastName;
	private String email;
	private String contact;
	private int BranchId;
	private String role;
	
	

}
