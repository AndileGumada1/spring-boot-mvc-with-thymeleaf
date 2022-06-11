package com.andile.springbootthymeleaf.service;
import java.util.List;

import com.andile.springbootthymeleaf.model.Employee;

public interface EmployeeService {
    List<Employee> getAllEmployees(); 
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);

}
