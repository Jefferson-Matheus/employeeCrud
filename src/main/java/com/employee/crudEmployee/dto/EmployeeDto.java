package com.employee.crudEmployee.dto;

import com.employee.crudEmployee.entity.EmployeeEntity;

public class EmployeeDto {
	
	private Long id;
	private String name;
	private String resume;
	
	
	public EmployeeDto(EmployeeEntity employee) {
		super();
		this.id = employee.getId();
		this.name = employee.getName();
		this.resume = employee.getResume();
	}


	public EmployeeDto() {}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getResume() {
		return resume;
	}


	public void setResume(String resume) {
		this.resume = resume;
	}
	
	
	
	
	
	
}
