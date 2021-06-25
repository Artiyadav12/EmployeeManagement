package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService appService;
	
	/*
	 * Get all employees
	 */
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return this.appService.getAllEmployees();
	}
	
	
	/*
	 * Get employee with particular empCode
	 */
	@GetMapping("/employees/{empCode}")
	public Employee getEmployee(@PathVariable String empCode) {
		return this.appService.getEmployee(Integer.parseInt(empCode));
	}
	
	/*
	 * Add a new employee
	 */
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee emp) {
		return this.appService.addEmployee(emp);
	}
	
	/*
	 * Update employee using PUT request
	 */
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee emp) {
		return this.appService.updateEmployee(emp);
	}
	
	
	@DeleteMapping("/employees/{empCode}")
	public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable int empCode){
		try {
			this.appService.deleteEmployee(empCode);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
}
