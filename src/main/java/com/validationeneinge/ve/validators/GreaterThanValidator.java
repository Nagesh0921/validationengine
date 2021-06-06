package com.validationeneinge.ve.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class GreaterThanValidator implements ConstraintValidator<GreaterThanRange, String>{

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		return (value != null) && (value.length() >= 5);
	}

}
