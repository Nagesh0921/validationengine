package com.validationeneinge.ve.validators;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = DateRangeValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface DateRange {
	String message() default "VM Error: Date Should be in the range of 01/01/1990 and 31/12/2999";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
