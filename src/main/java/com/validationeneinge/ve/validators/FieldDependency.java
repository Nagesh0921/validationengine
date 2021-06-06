package com.validationeneinge.ve.validators;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = DependentFieldValidator.class)
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface FieldDependency {
	String message() default "engRetOpt Field must not be empty!!";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
    
    String firstField();
    String secondField();
    
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
            @interface List
    {
    	FieldDependency[] value();
    }
}
