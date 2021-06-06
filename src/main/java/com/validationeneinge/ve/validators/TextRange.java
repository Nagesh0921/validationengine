package com.validationeneinge.ve.validators;

import java.lang.annotation.*;

import javax.validation.Constraint;
import javax.validation.Payload;


@Documented
@Constraint(validatedBy = TextRangeValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface TextRange {
	String message() default "VM Error : Range should be in between 0 to 99999";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
