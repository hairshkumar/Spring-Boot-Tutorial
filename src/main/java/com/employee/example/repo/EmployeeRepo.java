package com.employee.example.repo;

import java.util.List;
import com.employee.example.model.Employee;
import com.employee.example.model.Employees;

public class EmployeeRepo {

	private List<Employee> employees = new Employees();

	public Employee getEmployee(int employeeId) {
		return getEmployeeBasedonId(employeeId);
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void updateEmployeeDetailsById(int employeeId,Employee updatedemployee) {
		Employee employee=getEmployeeBasedonId(employeeId);
		employees.set(employees.indexOf(employee), updatedemployee);
	}

	public void createEmployee(Employee employee) {
		employees.add(employee);
	}

	public void deleteEmployeeDetailsById(int employeeId) {
		Employee employee=getEmployeeBasedonId(employeeId);
		employees.remove(employee);
	}
	
	private Employee getEmployeeBasedonId(int id) {
		return employees.stream().filter(employee -> employee.getId() == id).findFirst().get();
	}
}
