package com.yash.employeemanagement.rest.service;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import com.yash.employeemanagement.rest.model.Project;

public class ProjectServiceImpl implements ProjectService {
	private static AtomicInteger PROJECT_COUNTER = new AtomicInteger();  

	@Override
	public Project create(Project project) {
		return null;
	}

	@Override
	public Project findById(Integer projectId) {
		return null;
	}

	@Override
	public List<Project> findAll() {
		return null;
	}

	@Override
	public Project update(Project project) {
		return null;
	}

	@Override
	public void delete(Integer projectId) {
		
	}
	
	private int getProjectId() {
		return PROJECT_COUNTER.incrementAndGet();
	}
}
