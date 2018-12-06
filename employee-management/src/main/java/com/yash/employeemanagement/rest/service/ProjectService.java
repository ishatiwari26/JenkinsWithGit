package com.yash.employeemanagement.rest.service;

import java.util.List;

import com.yash.employeemanagement.rest.model.Project;

public interface ProjectService {
	Project create(Project project);
	Project findById(Integer projectId);
	List<Project> findAll();
	Project update(Project project);
	void delete(Integer projectId);
}
