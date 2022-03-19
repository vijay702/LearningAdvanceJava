package org.studyeasy.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		// read spring config file 
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(SportConfig.class);
		// get the bean from spring container 
		
		Coach theCoach =  context.getBean("swimCoach",Coach.class);
		
		//call the method on the bean 
		System.out.println(theCoach.getDailyWorkOut());
		
		
		// call method daily fortune
		System.out.println(theCoach.getDailyFortune());
	
		// close the context 
		context.close();
		

	}

	
}
 