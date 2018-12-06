package com.yash.employeemanagement.rest.service;

import java.util.List;

import com.yash.employeemanagement.rest.model.Employee;

public interface EmployeeService {
	Employee findById(int empId) throws Exception;
	List<Employee> findAll();
	Employee create(Employee employee);
	Employee update(Employee employee) throws Exception;
	void delete(int empId) throws Exception;
}
