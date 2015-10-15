package com.packt.webstore.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.packt.webstore.domain.Employee;

@Repository
public interface LocateOneEmployeeByHisNumber extends CrudRepository<Employee, Integer> {

	@Query(value = "select  e from Employee e where e.employeeNumber = :employeeID")
	Employee getEmployeeByNumber(@Param("employeeID")Integer employeeID);

}
