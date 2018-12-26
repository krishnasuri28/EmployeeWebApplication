package com.employee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.modal.Countries;
import com.employee.modal.Employee;
import com.employee.repository.CountriesRepository;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private CountriesRepository countriesRepository;
	
	public void saveEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	public List<Employee> findAllEmployees() {
		List<Employee> employees = new ArrayList<>();
		employeeRepository.findAll().forEach(employees::add);
		return employees;
	}

	public void delete(String id) {
		employeeRepository.deleteById(id);
	}
	
	public List<Countries> getAllCountries(){
		List<Countries> countries = new ArrayList<>();
		countriesRepository.findAll().forEach(countries :: add);
		return countries;
	}
}
