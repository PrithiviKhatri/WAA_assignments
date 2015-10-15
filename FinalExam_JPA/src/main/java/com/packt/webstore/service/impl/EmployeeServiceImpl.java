package com.packt.webstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.packt.webstore.domain.Employee;
import com.packt.webstore.repository.EmployeeRepository;
import com.packt.webstore.repository.LocateOneEmployeeByHisNumber;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository empRepo;
	@Autowired
	LocateOneEmployeeByHisNumber empbyNo;

	public List<Employee> getAllEmployees() {

		return (List<Employee>) empRepo.findAll();
	}

	public Employee getEmployeeByNumber(Integer empId) {
		System.out.println("empId is " + empId);
		return empbyNo.getEmployeeByNumber(empId);
	}

	public Employee save(Employee employee) {
		return empRepo.save(employee);
	}

}
