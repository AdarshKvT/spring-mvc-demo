package com.kvtsoft.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private Integer enrollmentNo;
	private String country;
	private LinkedHashMap<String, String> countryOptions;
	private String favoriteLanguage;
	private String[] operatingSystems;

	// no arg constructor
	public Student() {

		// populate counry options: used ISO country code
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("BRA", "Bharat");
		countryOptions.put("FRA", "France");
		countryOptions.put("BR", "Brazil");
		countryOptions.put("ITA", "Italy");
		countryOptions.put("DEU", "Germany");
		countryOptions.put("CA", "Canada");
		countryOptions.put("EG", "Egypt");
		countryOptions.put("NL", "Netherlands");

	}

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

	public Integer getEnrollmentNo() {
		return enrollmentNo;
	}

	public void setEnrollmentNo(Integer enrollmentNo) {
		this.enrollmentNo = enrollmentNo;

	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

}
