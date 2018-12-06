package com.yash.employeemanagement.rest.model;

public class Project {
	
	private Integer projectId;
	
	private String projectName;
	
	private String clientName;
	
	private Integer resourceCount;

	public Project(Integer projectId, String projectName, String clientName, Integer resourceCount) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.clientName = clientName;
		this.resourceCount = resourceCount;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public Integer getResourceCount() {
		return resourceCount;
	}

	public void setResourceCount(Integer resourceCount) {
		this.resourceCount = resourceCount;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
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
			Project project = (Project) obj;
			return getProjectId().equals(project.getProjectId());
		}
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", clientName=" + clientName
				+ ", resourceCount=" + resourceCount + "]";
	}
}
