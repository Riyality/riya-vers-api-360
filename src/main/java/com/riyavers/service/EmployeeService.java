package com.riyavers.service;

import java.util.List;

import com.riyavers.dto.employee.EmployeeRequestDTO;
import com.riyavers.dto.employee.EmployeeResponseDTO;

public interface EmployeeService {
	public boolean addEmployee(EmployeeRequestDTO employeeRequestDTO);

	public List<EmployeeResponseDTO> allEmployee();

}
