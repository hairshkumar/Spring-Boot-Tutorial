package com.employee.example.model;

import java.io.Serializable;
import java.util.*;

public class Employees implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Employee> employees;

	public Employees() {
	}

	public Employees(List<Employee> employees) {
		super();
		this.employees = employees;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Employees [employees=" + employees + "]";
	}

}
