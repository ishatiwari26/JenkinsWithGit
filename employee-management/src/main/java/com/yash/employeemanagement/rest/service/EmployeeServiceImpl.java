package com.yash.employeemanagement.rest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import com.yash.employeemanagement.rest.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private static final AtomicInteger EMPLOYEE_COUNTER = new AtomicInteger();
	private static List<Employee> employees = new ArrayList<>();
	static{
		employees.add(new Employee(getEmployeeId(), "Anish", "Singh", "Software Engineer", new ArrayList<>()));
		employees.add(new Employee(getEmployeeId(), "Prakash", "Mehta", "Sr. Software Engineer", new ArrayList<>()));
		employees.add(new Employee(getEmployeeId(), "Anjalee", "Sharma", "Test Engineer", new ArrayList<>()));
		employees.add(new Employee(getEmployeeId(), "Anoop", "Kumar", "Trainee Engineer", new ArrayList<>()));
	}
	
	@Override
	public Employee findById(int empId) throws Exception {
		for (Employee employee : employees) {
			if(employee.getEmpId() == empId) {
				return employee;
			}
		}
		throw new Exception();
	}

	@Override
	public List<Employee> findAll() {
		return employees;
	}

	@Override
	public Employee create(Employee employee) {
		Employee newEmployee = createEmployee(employee);
		employees.add(newEmployee);
		return newEmployee;
	}

	@Override
	public Employee update(Employee employee) throws Exception {
		Employee employeeObj = findById(employee.getEmpId());
		employeeObj.setFirstName(employee.getFirstName());
		employeeObj.setLastName(employee.getLastName());
		employeeObj.setDesignation(employee.getDesignation());
		employeeObj.setProjects(employee.getProjects());
		return employeeObj;
	}

	@Override
	public void delete(int empId) throws Exception {
		Employee employee = findById(empId);
		if(employee != null)
			employees.remove(employee);
	}
	
	private static int getEmployeeId() {
		return EMPLOYEE_COUNTER.incrementAndGet();
	}
	
	private Employee createEmployee(Employee emp){
		Employee newEmployee = new Employee(getEmployeeId(), emp.getFirstName(), emp.getLastName()
				, emp.getDesignation(), emp.getProjects());
		return newEmployee;
	}
}
