package com.employee.modal;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private String id;
	private String name; 
	private String department;
	private Integer salary;
	private Date joiningDate;
	private String sex;
	private String email;
	private String address;
	private Integer number;
	private String country;
	
	public Employee() {
		
	}
	
	public Employee (Employee employee) {
		this.id = employee.getId();
		this.name = employee.getName();
		this.department = employee.getDepartment();
		this.salary = employee.getSalary();
		this.joiningDate = employee.getJoiningDate();
		this.sex = employee.getSex();
		this.email = employee.getEmail();
		this.address = employee.getAddress();
		this.number = employee.getNumber();
		this.country = employee.getCountry();
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}


}
