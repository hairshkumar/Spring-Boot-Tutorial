package com.employee.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.example.model.Employee;
import com.employee.example.model.Employees;
import com.employee.example.repo.EmployeeRepo;

@Service
public class EmployeeManagamentService {

	private EmployeeRepo employeeRepo=new EmployeeRepo();
	
	public Employee getEmployeeById(int employeeId) {
		return employeeRepo.getEmployee(employeeId);
	}
	
	public Employees getEmployees() {
		Employees employees=(Employees) employeeRepo.getEmployees();
		return employees;
	}
	    
	public void updateEmployeeById(int employeeId,Employee updatedEmployee) {
		employeeRepo.updateEmployeeById(employeeId,updatedEmployee);
	}
	
	public void createEmployee(Employee employee) {
		employeeRepo.createEmployee(employee);		
	}
	
	public void deleteEmployeeById(String employeeId) {
		employeeRepo.deleteEmployeeById(Integer.parseInt(employeeId));
	}
}
