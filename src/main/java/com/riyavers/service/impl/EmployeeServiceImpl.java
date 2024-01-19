package com.riyavers.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.riyavers.dto.employee.EmployeeRequestDTO;
import com.riyavers.dto.employee.EmployeeResponseDTO;
import com.riyavers.entity.Branch;
import com.riyavers.entity.Employee;
import com.riyavers.mapper.Employee.EmployeeMapper;
import com.riyavers.repository.BranchRepository;
import com.riyavers.repository.EmployeeRepository;
import com.riyavers.service.EmployeeService;

@Service

public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeMapper employeeMapper;
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	BranchRepository branchRepository;

	public boolean addEmployee(EmployeeRequestDTO employeeRequestDTO) {
		Optional<Branch> branch=branchRepository.findById(employeeRequestDTO.getBranchId());
		if (branch.isPresent()) {
			
		      	try {
			
			        Employee Employee = employeeMapper.toEntity(employeeRequestDTO);
                      Employee.setBranch(branch.get());
			        employeeRepository.save(Employee);
			        return true;
			
		            } catch (Exception e) {
			           // TODO: handle exception
		            }
		      }
		
		
		
		return false;
	}

	public List<EmployeeResponseDTO> allEmployee() {
		try {
			List<Employee> Employee= (List<com.riyavers.entity.Employee>) employeeRepository.findAll();
			System.out.println("wellcome to java");
			return employeeMapper.toResponseDto(Employee);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
		
	}

}
