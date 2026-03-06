package com.employee.crudEmployee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.crudEmployee.dto.EmployeeDto;
import com.employee.crudEmployee.entity.EmployeeEntity;
import com.employee.crudEmployee.repository.EnployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EnployeeRepository employeeRepository;
	
	
	public List<EmployeeDto> listAllEmployees(){
		
		List<EmployeeEntity> allEmployeesResponse = employeeRepository.findAll();
		
		List<EmployeeDto> allEmployees = allEmployeesResponse.stream().map(employee -> new EmployeeDto(employee)).toList();
		
		return allEmployees;
		
	}
	
	
}
