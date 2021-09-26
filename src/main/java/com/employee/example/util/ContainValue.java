package com.employee.example.util;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ ElementType.FIELD,ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ContainValueValidator.class)
@Documented
public @interface ContainValue {

  String message() default "Value cannot be blank,empty or NULL.";

  Class<?>[] groups() default { };

  Class<? extends Payload>[] payload() default { };

}