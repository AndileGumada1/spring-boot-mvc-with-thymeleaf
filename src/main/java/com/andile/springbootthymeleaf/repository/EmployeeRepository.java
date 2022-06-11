package com.andile.springbootthymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andile.springbootthymeleaf.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    
}
