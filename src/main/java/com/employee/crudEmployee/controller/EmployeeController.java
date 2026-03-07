package com.employee.crudEmployee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.crudEmployee.dto.EmployeeDto;
import com.employee.crudEmployee.service.EmployeeService;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping
	public List<EmployeeDto> findAllEmployees(){
		List<EmployeeDto> allEmployess = employeeService.listAllEmployees();
		
		return allEmployess;
	}
}
