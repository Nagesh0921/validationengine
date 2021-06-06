package com.validationeneinge.ve.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class SpecialCharacterValidator implements ConstraintValidator<SpecialCharacter, String> {

	Pattern regex = Pattern.compile("[^A-Za-z0-9]");
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		Matcher matcher = regex.matcher(value);
		return !matcher.find();
	}

}
