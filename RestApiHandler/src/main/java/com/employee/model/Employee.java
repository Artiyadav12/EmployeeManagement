package com.employee.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int empCode;
	private String empName;
	private String location;
	private String email;
	private String dOB;
	
	public Employee() {
		super();
	}

	public Employee(int empCode, String empName, String location, String email, String dOB) {
		super();
		this.empCode = empCode;
		this.empName = empName;
		this.location = location;
		this.email = email;
		this.dOB = dOB;
	}

	public int getEmpCode() {
		return empCode;
	}

	public void setEmpCode(int empCode) {
		this.empCode = empCode;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getdOB() {
		return dOB;
	}

	public void setdOB(String dOB) {
		this.dOB = dOB;
	}

	@Override
	public String toString() {
		return "Employee [empCode=" + empCode + ", empName=" + empName + ", location=" + location + ", email=" + email
				+ ", dOB=" + dOB + "]";
	}
}
