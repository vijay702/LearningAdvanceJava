package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	// need a controller method show initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		
		return "helloworld-form";
				
	}
	

//	need a Controller method to process the HTML form 
	@RequestMapping("/processForm")
	public String processForm() {
		
		return "helloworld";
	}

	
	//new controller method to read form data
	//add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letShoutDude(HttpServletRequest request, Model model) {
		//read the request parameter from the Html form
		String theName =request.getParameter("studentname");
		
		//convert the Data to all caps 
		theName = theName.toUpperCase();
		
		//create the message
		String result = "yo!" + theName;
		
		//add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	
	

	
	@RequestMapping("/processFormVersionThree")
	public ModelAndView processFormVersionThree(@RequestParam("studentname") String theName, Model model) {
		//read the request parameter from the Html form
		
		ModelAndView mav = new ModelAndView();
		
		//convert the Data to all caps 
		theName = theName.toUpperCase();
		
		//create the message
		String result = "Hey My Friend v3!" + theName;
		
		//add message to the model
		mav.addObject("message", result);
		mav.setViewName("helloworld"); 
		
		return mav;
	}
	
	
	
	
	
	
	
	
	
	
}
