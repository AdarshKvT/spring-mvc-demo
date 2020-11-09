package com.kvtsoft.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;

	// for multiple coursePrefixes
//	private String[] coursePrefixes; 

	// assign the value from passed in from our annotation
	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefix = theCourseCode.value();
	}

	// spring mvc will call: isValid method
	// can pass extra validation error messages using "constraintValidatorContext"
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {
		boolean result;

		// if nothing entered then return true, the course code is not a required field
		if (theCode != null) {
			result = theCode.startsWith(coursePrefix);
		} else {
			result = true;
		}
		return result;
	}

}

//@Override
//public boolean isValid(String theCode, 
//                    ConstraintValidatorContext theConstraintValidatorContext) {
//    boolean result = false;
//    
//    if (theCode != null) {
//        
//        //
//        // loop thru course prefixes
//        //
//        // check to see if code matches any of the course prefixes
//        //
//        for (String tempPrefix : coursePrefixes) {
//            result = theCode.startsWith(tempPrefix);
//            
//            // if we found a match then break out of the loop
//            if (result) {
//                break;
//            }
//        }
//    }
//    else {
//        result = true;
//    }
//    
//    return result;
//}
