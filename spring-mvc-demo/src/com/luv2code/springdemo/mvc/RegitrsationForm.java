package com.luv2code.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rrase")
public class RegitrsationForm {
	
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
		
		
	}
	
	
	
	
	@RequestMapping("/register")
	public String showForm(Model model) {
		
		StudentRegistration register = new StudentRegistration();
		
		model.addAttribute("student", register);
		
		return "register-form";
	}

	
	@RequestMapping("/details")
	public String Showview (@Valid  @ModelAttribute ("student")   StudentRegistration register, BindingResult theBindingResult  ) {
		
		if(theBindingResult.hasErrors()) {
			return  "register-form";
		}else {
			System.out.println("****************");
			
			return "show-page";

			
		}
		
		
		
	}
	
}
