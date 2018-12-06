package com.yash.employeemanagement.rest.model;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private Integer empId;
	
	private String firstName;
	
	private String lastName;
	
	private String designation;
	
	private List<Project> projects = new ArrayList<>();
	
	public Employee() {
		
	}
	
	public Employee(Integer empId, String firstName, String lastName, String designation, List<Project> projects) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.designation = designation;
		this.projects = projects;
	}


	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}


	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		} else if(obj == null) {
			return false;
		} else if(getClass() != obj.getClass()) {
			return false;
		} else {
			Employee employee = (Employee) obj;
			return getEmpId().equals(employee.getEmpId());
		}
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", designation="
				+ designation + ", projects=" + projects + "]";
	}

}
