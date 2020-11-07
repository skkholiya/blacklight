package com.example.demo.validator;

import java.util.Optional;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.persistances.User;
import com.example.demo.services.UserMatchService;

public class CheckIdValidator implements ConstraintValidator<CheckId, Long> {

	private static final Logger LOGGER = Logger.getLogger(CheckIdValidator.class);
	@Autowired
	private UserMatchService service;

	@Override
	public boolean isValid(Long value, ConstraintValidatorContext context) {
		Optional<User> getId = Optional.ofNullable(service.getUserDetails(value));
		LOGGER.info("userid" + getId);
		if (getId.isPresent()) {
			return true;
		}
		return false;
	}

}
