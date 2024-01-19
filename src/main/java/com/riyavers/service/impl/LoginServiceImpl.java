package com.riyavers.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.riyavers.dto.login.LoginRequestDto;
import com.riyavers.dto.login.LoginResponceDto;
import com.riyavers.entity.Employee;
import com.riyavers.entity.Login;
import com.riyavers.mapper.login.LoginMapper;
import com.riyavers.repository.EmployeeRepository;
import com.riyavers.repository.LoginRepository;
import com.riyavers.service.LoginService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginRepository loginRepository;

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private LoginMapper loginMapper;
	
    public LoginResponceDto login(LoginRequestDto dto) {
		try {
			Login login = loginRepository.findByUsername( dto.getUsername() );
			if ( login != null && ( login.getPassword().equals( dto.getPassword() ) && login.getRole().equals("Receptionist"))){
				Employee employee = employeeRepository.findByEmail( dto.getUsername() );
				LoginResponceDto response = loginMapper.toLoginResponseDto( login );
//				response.setBranchId( employee.getBranch().getId() );
//				response.setBranchName( employee.getBranch().getName() );
				response.setLoginId( employee.getId() );
				return response;
				
			}
		} catch ( Exception e ) {
			log.error( e.getMessage(), e );
		}
		// TODO Auto-generated method stub
		return null;
	}

/*	public LoginResponceDto login( LoginRequestDto dto ) {
		try {
			Login login = loginRepository.findByUsername( dto.getUsername() );
			if ( login != null && ( login.getPassword().equals( dto.getPassword() ) && login.getRole().equals( "Receptionist" ) ) ) {
				Employee employee = employeeRepository.findByEmail( dto.getUsername() );
				LoginResponceDto response = loginMapper.toLoginResponseDto( login );
				response.setBranchId( employee.getBranch().getId() );
				response.setBranchName( employee.getBranch().getName() );
				response.setLoginId( employee.getId() );
				return response;

			}
		} catch ( Exception e ) {
			log.error( e.getMessage(), e );
		}
		return null;
	}*/

}
