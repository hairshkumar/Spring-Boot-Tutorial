package com.employee.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.example.model.Employee;
import com.employee.example.model.Employees;
import com.employee.example.repo.EmployeeRepo;

@Service
public class EmployeeManagamentService {

	private EmployeeRepo employeeRepo=new EmployeeRepo();
	
	public Employee getEmployeeDetailsById(int employeeId) {
		return employeeRepo.getEmployee(employeeId);
	}
	
	public Employees getEmployees() {
		Employees employees=(Employees) employeeRepo.getEmployees();
		return employees;
	}
	    
	public void updateEmployeeDetailsById(int employeeId,Employee updatedEmployee) {
		employeeRepo.updateEmployeeDetailsById(employeeId,updatedEmployee);
	}
	
	public void createEmployee(Employee employee) {
		employeeRepo.createEmployee(employee);		
	}
	
	public void deleteEmployeeDetailsById(String employeeId) {
		employeeRepo.deleteEmployeeDetailsById(Integer.parseInt(employeeId));
	}
}
