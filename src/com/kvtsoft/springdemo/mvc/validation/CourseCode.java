package com.kvtsoft.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

	// define some attributes below that can be passed into annotation
	// define default course codes (value)
	public String value() default "KVT";

    // define default course code for multiple validation
//    public String[] value() default {"KVT","BRD","MTECH"};
	
	// define default error message
	public String message() default "must start with KVT";

	// define default groups (group validation constrain together)
	// groups: can group related constraints
	public Class<?>[] groups() default {};

	// define default pay load (gives additional info about the error)
	// Payloads: provide custom details about the validation failure (security
	// level, error code etc)
	public Class<? extends Payload>[] payload() default {};

}
