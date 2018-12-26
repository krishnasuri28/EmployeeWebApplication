package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.employee.modal.Countries;
import com.employee.modal.Employee;
import com.employee.service.EmployeeService;

@RequestMapping("/employee")
@RestController
public class EmployeeController {
	

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/findAllEmployee")
	public List<Employee> getAllEmployee() {
		return employeeService.findAllEmployees();
	}

	@RequestMapping(value = "/createEmployee", method = RequestMethod.POST)
	public void createEmployee(@RequestBody Employee employee){
		employeeService.saveEmployee(employee);
	}

	@RequestMapping(value = "/updateEmployee", method = RequestMethod.PUT)
	public Employee updateEmployee(@RequestBody Employee employee)  {
		Employee employeeObject = new Employee(employee);
		return employeeService.updateEmployee(employeeObject);
	}
	
	@RequestMapping(value = "/deleteEmployee/{id}", method = RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable String id) {
		employeeService.delete(id);
	}
	
	@RequestMapping(value="/getAllCountries", method  = RequestMethod.GET)
	public List<Countries> getAllCountries(){
		return employeeService.getAllCountries();
	}
}
