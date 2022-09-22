package com.test.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
@Entity
@Table(name = "Organisation")
public class Organisation {
	
	@Id
	@GeneratedValue
	@Column(name = "Org_Id")
	@JsonProperty("ID")
	private int id;
	
	@Column(name = "Org_Name")
	@JsonProperty("Name")
	private String orgName;
	
	@Column(name = "Org_headQuarters")
	@JsonProperty("Head")
	private String orgHeadquarters;
	
	@Column(name = "Org_EmployeeCount")
	@JsonProperty("Count")
	private int employeeCount;
	
	@OneToMany(
	        mappedBy = "organisation",
	        cascade = CascadeType.ALL,
	        orphanRemoval = true
	    )
	private List<Employee> employee = new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		id = id;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getOrgHeadquarters() {
		return orgHeadquarters;
	}

	public void setOrgHeadquarters(String orgHeadquarters) {
		this.orgHeadquarters = orgHeadquarters;
	}

	public int getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	public Organisation(int id, String orgName, String orgHeadquarters, int employeeCount, List<Employee> employee) {
		super();
		id = id;
		this.orgName = orgName;
		this.orgHeadquarters = orgHeadquarters;
		this.employeeCount = employeeCount;
		this.employee = employee;
	}

	public Organisation() {
		super();
	}
	
	

}
