package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dao.EmployeeDao;
import com.employee.model.Employee;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	public EmployeeServiceImpl() {
		super();
	}


	@Override
	public List<Employee> getAllEmployees() {
		return employeeDao.findAll();
	}

	@Override
	public Employee getEmployee(int empCode) {
		//return employeeDao.getOne(empCode);
		return employeeDao.getById(empCode);
		//employeeDao.getOne(empCode);
	}


	@Override
	public Employee addEmployee(Employee emp) {
		employeeDao.save(emp);
		return emp;
	}


	@Override
	public Employee updateEmployee(Employee emp) {
		employeeDao.save(emp);
		return emp;
	}


	@SuppressWarnings("deprecation")
	@Override
	public void deleteEmployee(int empCode) {
		Employee e = employeeDao.getOne(empCode);
		employeeDao.delete(e);	
	}	
}
