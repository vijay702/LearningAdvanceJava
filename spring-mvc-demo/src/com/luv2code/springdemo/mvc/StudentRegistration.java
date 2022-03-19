package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class StudentRegistration {
	@NotNull(message="enter your name")
	@Size(min=1,message="name must be greater than one")
	private String name;
	
	@NotNull(message="enter data ")
	private Integer age;
	
	@NotNull(message="enter data ")
	@Min(value=0)
	@Max(value=12)
	private String number;
	
	private String department;
	
	 private LinkedHashMap<String,String> departmentoption;
	 
	 
	 public StudentRegistration() {
		 
		 departmentoption = new LinkedHashMap<>();
		 departmentoption.put("IT", "IT");
		 departmentoption.put("CSE", "CSE");
		 departmentoption.put("Aeronautical", "Aeronautical"); 
		 
	 }


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public LinkedHashMap<String, String> getDepartmentoption() {
		return departmentoption;
	}
	 
	 
}
