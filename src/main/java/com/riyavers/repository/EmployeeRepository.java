package com.riyavers.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.riyavers.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	Employee findByEmail( String username );

}
