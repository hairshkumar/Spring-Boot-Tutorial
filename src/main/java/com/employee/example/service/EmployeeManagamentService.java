package com.employee.example.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.example.model.Employee;
import com.employee.example.model.Employees;
import com.employee.example.repo.EmployeeRepository;

@Service
public class EmployeeManagamentService {

	@Autowired
	private EmployeeRepository employeeRepo;

	public Employee getEmployeeDetailsById(int employeeId) {
		return employeeRepo.findById(employeeId).get();
	}

	public Employees getEmployees() {
		Employees employees=new Employees();
		employees.setEmployees(employeeRepo.findAll());
		return employees;
	}

	public void updateEmployeeDetailsById(int employeeId, Employee updatedEmployee) {
		employeeRepo.save(updatedEmployee);
	}

	public void createEmployee(Employee employee) {
		employeeRepo.save(employee);
	}

	public void deleteEmployeeDetailsById(String employeeId) {
		employeeRepo.deleteById(Integer.valueOf(employeeId));
	}
}
