package com.yash.employeemanagement.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.yash.employeemanagement.rest.model.Employee;
import com.yash.employeemanagement.rest.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/employee/{empId}", method = RequestMethod.GET, produces = { "application/xml",
			"aplication/json" }, headers = { "Accept=application/json" })
	@ResponseStatus(value = HttpStatus.OK)
	public @ResponseBody Employee getEmployee(@PathVariable Integer empId) throws Exception {
		return employeeService.findById(empId);
	}

	@RequestMapping(value = "/employee", method = RequestMethod.POST, consumes = { "application/json" }, produces = {
			"applcation/json" })
	@ResponseStatus(value = HttpStatus.CREATED)
	public @ResponseBody Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.create(employee);
	}

	@RequestMapping(value = "/employee/{empId}", method = RequestMethod.PUT, consumes = {
			"application/json" }, produces = { "applcation/json" })
	@ResponseStatus(value = HttpStatus.OK)
	public @ResponseBody Employee updateEmployee(@RequestBody Employee employee) throws Exception {
		return employeeService.update(employee);
	}

	@RequestMapping(value = "/employee/{empId}", method = RequestMethod.DELETE)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void deleteEmployee(@PathVariable("empId") Integer empId) throws Exception {
		employeeService.delete(empId);
	}

	@RequestMapping(value = "/employees", method = RequestMethod.GET, produces = "application/json")
	@ResponseStatus(value = HttpStatus.OK)
	public @ResponseBody List<Employee> getEmployees() {
		return employeeService.findAll();
	}
}
