package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	
	
	private String firstName;
	private String lastName;
	private String country;
	

	private LinkedHashMap<String,String> favoriteLanguageoptions;
	private LinkedHashMap<String,String> countryOptions;
	
	// populate country options : used ISO Country COde 
	
	private String favoriteLanguage;
	

	public Student() 
	{
		countryOptions =new LinkedHashMap<>();
		
		countryOptions.put("IND", "INDIA");
		countryOptions.put("CH", "China");
		countryOptions.put("RSA", "Russia");
		countryOptions.put("PAk", "Pakistan");
		countryOptions.put("Afg", "Afganistan");
		
		
		favoriteLanguageoptions =new LinkedHashMap<>();
		
		favoriteLanguageoptions.put("java", "java");
		favoriteLanguageoptions.put("c++", "c++");
		favoriteLanguageoptions.put("python", "python");
		
	}


	


	public LinkedHashMap<String, String> getFavoriteLanguageoptions() {
		return favoriteLanguageoptions;
	}





	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
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


	
	
}
