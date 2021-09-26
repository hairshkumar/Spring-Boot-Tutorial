package com.employee.example.util;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.employee.example.model.Employee;

@Component
public class RequestBodyValidator {

	@Autowired
	private Validator validator;

	public boolean validRequestBody(Employee employee) {

		Set<ConstraintViolation<Employee>> constraintViolations = validator.validate(employee);
		if (!constraintViolations.isEmpty()) {
			throw new ConstraintViolationException(constraintViolations);
		}
		return true;
	}
}
