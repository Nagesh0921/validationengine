package com.validationengine.ve.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.validationeneinge.ve.validators.DependentFieldValidator;
import com.validationengine.ve.bo.Aircraft;
import com.validationengine.ve.bo.ResponseBuilder;

@Service
public class ValidationService {
	
	@Autowired
	private Validator validator;
	
	public List<ResponseBuilder> validate(@Valid Aircraft ac) {
		Set<ConstraintViolation<Aircraft>> violations = validator.validate(ac);
		ArrayList<ResponseBuilder> res = new ArrayList<>();
		if(!violations.isEmpty()) {
			for(ConstraintViolation<Aircraft> constraintViolations : violations) {
				ResponseBuilder builder = new ResponseBuilder();
				
				String val = (constraintViolations.getPropertyPath() == null) ? new DependentFieldValidator().getSecondField() : constraintViolations.getPropertyPath().toString();
				builder.setFieldName(val);
				builder.setMessage(constraintViolations.getMessage());
				res.add(builder);
			}
		} else {
			ResponseBuilder builder = new ResponseBuilder("Success");
			res.add(builder);
		}

		return res;
	}
}
