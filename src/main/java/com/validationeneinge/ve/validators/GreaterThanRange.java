package com.validationeneinge.ve.validators;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = GreaterThanValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface GreaterThanRange {
	String message() default "VM Error: Length Should be Greater than 50";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
