package com.employee.crudEmployee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.crudEmployee.entity.EmployeeEntity;

public interface EnployeeRepository extends JpaRepository<EmployeeEntity, Long>{

}
