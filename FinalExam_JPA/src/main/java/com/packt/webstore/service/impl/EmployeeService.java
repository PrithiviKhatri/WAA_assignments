package com.packt.webstore.service.impl;

import java.util.List;

import com.packt.webstore.domain.Employee;



public interface EmployeeService {

	List<Employee> getAllEmployees();

	Employee getEmployeeByNumber(Integer empId);

	Employee save(Employee employee);



}
