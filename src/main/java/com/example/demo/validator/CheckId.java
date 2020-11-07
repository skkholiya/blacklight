package com.example.demo.validator;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = CheckIdValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ FIELD, METHOD,ElementType.PARAMETER })
public @interface CheckId {

	String message() default "invalid id";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
