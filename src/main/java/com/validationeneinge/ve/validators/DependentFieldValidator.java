package com.validationeneinge.ve.validators;

import java.lang.reflect.InvocationTargetException;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.beanutils.BeanUtils;

public class DependentFieldValidator implements ConstraintValidator<FieldDependency, Object> {

	private String firstField;
	private String secondField;
	
	@Override
    public void initialize(final FieldDependency constraintAnnotation)
    {
		firstField = constraintAnnotation.firstField();
		secondField = constraintAnnotation.secondField();
    }
	
	@Override
	public boolean isValid(final Object value, final ConstraintValidatorContext context) {
		try {
			String firstObj = BeanUtils.getProperty(value, firstField);
			String secondObj = BeanUtils.getProperty(value, secondField);
			System.out.println("---");
			return (firstObj != null && secondObj != null) || (firstObj == null && secondObj == null);
		} catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public String getSecondField() {
		return secondField;
	}

	public void setSecondField(String secondField) {
		this.secondField = secondField;
	}

}
