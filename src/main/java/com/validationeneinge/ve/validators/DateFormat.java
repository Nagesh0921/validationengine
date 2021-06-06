package com.validationeneinge.ve.validators;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = DateFormatValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface DateFormat {
	String message() default "VM Error: Invalid Date Format, Valid Date Format dd/MM/yyyy ";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
