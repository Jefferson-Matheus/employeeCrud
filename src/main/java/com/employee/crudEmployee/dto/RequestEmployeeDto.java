package com.employee.crudEmployee.dto;

public class RequestEmployeeDto {

	private String name;
	private Float salary;
	private String resume;
	
	
	public RequestEmployeeDto() {}


	public RequestEmployeeDto(String name, Float salary, String resume) {
		super();
		this.name = name;
		this.salary = salary;
		this.resume = resume;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	
	
}
