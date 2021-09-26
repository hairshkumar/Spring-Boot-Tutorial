package com.employee.example.util;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.StringUtils;

public class ContainValueValidator implements ConstraintValidator<ContainValue, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		return StringUtils.isNotBlank(value);
	}
}