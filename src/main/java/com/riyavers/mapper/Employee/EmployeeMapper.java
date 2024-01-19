package com.riyavers.mapper.Employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.riyavers.dto.employee.EmployeeRequestDTO;
import com.riyavers.dto.employee.EmployeeResponseDTO;
import com.riyavers.entity.Employee;

@Component
public class EmployeeMapper {
	
	public Employee toEntity(EmployeeRequestDTO employeeRequestDTO)
	{
	Employee employee =new Employee();
	employee.setId((long) employeeRequestDTO.getId());
	employee.setFirstName(employeeRequestDTO.getFirstName());
	employee.setLastName(employeeRequestDTO.getLastName());
	employee.setEmail(employeeRequestDTO.getEmail());
	employee.setContact(employeeRequestDTO.getContact());
	employee.setRole(employeeRequestDTO.getRole());
	
	return employee;
	
	}

	public List<EmployeeResponseDTO> toResponseDto(List<Employee> employee) {
		
		List<EmployeeResponseDTO> listEmployeeResponseDTO= new ArrayList(); 
		for(Employee employeeEntity : employee ){
			listEmployeeResponseDTO.add(oneByoneResponseDto(employeeEntity));
				}
		return listEmployeeResponseDTO;
		}
	public EmployeeResponseDTO oneByoneResponseDto(Employee employeeEntity)
	{
		EmployeeResponseDTO employeeResponseDTO= new EmployeeResponseDTO();
		employeeResponseDTO.setId(employeeEntity.getId());
		employeeResponseDTO.setFirstName(employeeEntity.getFirstName());
		employeeResponseDTO.setLastName(employeeEntity.getLastName());
		employeeResponseDTO.setEmail(employeeEntity.getEmail());
		employeeResponseDTO.setContact(employeeEntity.getContact());
		employeeResponseDTO.setBranch(employeeEntity.getBranch());
		return employeeResponseDTO;
		}
	
//	public List<Practice1ResponseDto> toResponseDto(List<Practice1Entity> p) {
//		List<Practice1ResponseDto> p1ResponseDto= new ArrayList<>();
//		for(Practice1Entity P1Entity : p ){
//			p1ResponseDto.add(toPractice1ResponseDto(P1Entity));
//			
//		}
//		
//		return p1ResponseDto;
//		
//
//	}
//	public Practice1ResponseDto toPractice1ResponseDto(Practice1Entity P1Entity)
//	{
//		Practice1ResponseDto p1RDto= new Practice1ResponseDto();
//		p1RDto.setId(P1Entity.getPid());
//		p1RDto.setName(P1Entity.getPname());
//		p1RDto.setSal(P1Entity.getPsal());
//		return p1RDto;
//		}
}
