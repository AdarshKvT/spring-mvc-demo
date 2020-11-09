package com.kvtsoft.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.kvtsoft.springdemo.mvc.validation.CourseCode;

public class Customer {

	private String firstName;

	// adding validation rules
	@NotNull(message = "is requried")
	@Size(min = 2, message = "is required")
	private String lastName;

	@Min(value = 0, message = "min value must be greater than or equal to zero")
	@Max(value = 10, message = "max value must be less than or equal to ten")
	@NotNull(message = "is required")
	private Integer freePasses;

	@Pattern(regexp = "^[a-zA-Z0-9]{6}", message = "only 6 chars/digits")
	private String postalCode;

	@CourseCode(value = "BRD", message = "must start with BRD")
	private String courseCode;

//    @CourseCode(value={"BTECH", "MTECH"}, message="must start with BTECH or MTECH")
//    private String courseCode;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

}
