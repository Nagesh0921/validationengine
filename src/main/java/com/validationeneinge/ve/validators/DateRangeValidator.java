package com.validationeneinge.ve.validators;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DateRangeValidator implements ConstraintValidator<DateRange, String>{
	
	String minDateText = "01/01/1990";
	String maxDateText = "31/12/2999";
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		try {
			if(value == null) {
				return true;
			} else {
				Date actualDate = new SimpleDateFormat("dd/MM/yyyy").parse(value);
				Date minDate = new SimpleDateFormat("dd/MM/yyyy").parse(minDateText);
				Date maxDate = new SimpleDateFormat("dd/MM/yyyy").parse(maxDateText);
				return (actualDate.after(minDate) && actualDate.before(maxDate));
			}
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
