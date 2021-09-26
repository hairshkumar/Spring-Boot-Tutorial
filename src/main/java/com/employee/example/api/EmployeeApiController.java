package com.employee.example.api;

import com.employee.example.model.Employee;
import com.employee.example.model.Employees;
import com.employee.example.service.EmployeeManagamentService;
import com.employee.example.util.ContainValue;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.ApiParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import java.util.Optional;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-09-12T10:02:10.313+05:30")

@Controller
public class EmployeeApiController implements EmployeeApi {

	@Autowired
	private EmployeeManagamentService employeeManagamentService;

	@Override
	public ResponseEntity<Employees> getEmployee(
			@RequestHeader(value = "x-requestid", required = true) String xRequestid) {
		Employees employees = employeeManagamentService.getEmployees();
		return ResponseEntity.ok().body(employees);
	}

	@Override
	public ResponseEntity<Employee> getEmployeeBasedOnId(
			@RequestHeader(value = "x-requestid", required = true) String xRequestid,
			@PathVariable("employeeid") String employeeid) {
		Employee employee = employeeManagamentService.getEmployeeDetailsById(Integer.parseInt(employeeid));
		return ResponseEntity.ok().body(employee);
	}

	@Override
	public ResponseEntity<Void> addEmployee(@Valid @ContainValue @RequestHeader(value = "x-requestid", required = true) String xRequestid,
			@Valid @RequestBody Employee employeeDetails) {
		employeeManagamentService.createEmployee(employeeDetails);
		return ResponseEntity.noContent().build();
	}

	@Override
	public ResponseEntity<Void> deleteEmployeeBasedOnId(
			@RequestHeader(value = "x-requestid", required = true) String xRequestid,
			@PathVariable("employeeid") String employeeid) {
		employeeManagamentService.deleteEmployeeDetailsById(employeeid);
		return ResponseEntity.noContent().build();
	}

	@Override
	public ResponseEntity<Void> updateEmployeeBasedOnId(
			@RequestHeader(value = "x-requestid", required = true) String xRequestid,
			@Valid @RequestBody Employee employeeDetails) {
		employeeManagamentService.updateEmployeeDetailsById(employeeDetails.getId(),employeeDetails);
		return ResponseEntity.noContent().build();
	}

}
