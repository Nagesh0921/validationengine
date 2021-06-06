package com.validationeneinge.ve.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class TextRangeValidator implements ConstraintValidator<TextRange, String>{

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		//This works different following condition is what is valid, if something is not then it marks hasError = TRUE
		return (Integer.valueOf(value) >= 0 && Integer.valueOf(value) < 99999);
	}

}
