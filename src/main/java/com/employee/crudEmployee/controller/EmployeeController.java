package com.employee.crudEmployee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.crudEmployee.dto.EmployeeDto;
import com.employee.crudEmployee.dto.RequestEmployeeDto;
import com.employee.crudEmployee.entity.EmployeeEntity;
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
	
	@PostMapping
	public ResponseEntity<Void> saveEmployee(@RequestBody RequestEmployeeDto employeeRequest){
		EmployeeEntity employee = new EmployeeEntity();
		
		employee.setName(employeeRequest.getName());
		employee.setResume(employeeRequest.getResume());
		employee.setSalary(employeeRequest.getSalary());
		
		employeeService.savaEmployee(employee);
		
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> deleteEmployee(@PathVariable Long id){
		employeeService.deleteEmployee(id);
		return ResponseEntity.ok().build();
	}
}
