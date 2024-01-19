package com.riyavers.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.riyavers.dto.employee.EmployeeRequestDTO;
import com.riyavers.dto.employee.EmployeeResponseDTO;
import com.riyavers.service.EmployeeService;

@RestController
@RequestMapping( "/employee" )
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	@PostMapping
	public String addEmployee(@RequestBody EmployeeRequestDTO employeeRequestDTO){
		
		boolean isAdded=employeeService.addEmployee(employeeRequestDTO);
		if (isAdded) {
			return "data added successfully";
			
		}
		
		return "failed to added";
		
	}
	@GetMapping
	public List<EmployeeResponseDTO> allEmployee(){
		return employeeService.allEmployee();
		 
	}

}
