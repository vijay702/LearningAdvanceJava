package org.studyeasy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeansScopeDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScopeapplicationcontext2.xml");
		
		// retrive bean from speing container
		
		Coach thecoach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class);

		//check if they are the same
		boolean result =(thecoach == alphaCoach);
		
		System.out.println(result);	
		System.out.println("\nMemory location for thecoach" +thecoach);
		System.out.println("\nMemory location for alphaCoach" +alphaCoach);
		
		// close the context 
		context.close();
	}

}
