package org.studyeasy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoClass {

	public static void main(String[] args) {
		//load spring config 
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//retrive bean from spring container
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		
		Coach alphaCoach = context.getBean("tennisCoach",Coach.class);
		
		//check if they are the same 
		boolean result =(theCoach == alphaCoach);
		
		
		//printout the resuls
		System.out.println("\nPointing to the same object:" +result);
		System.out.println("\nMemory location for theCoach:" +theCoach);
		System.out.println("\nMemory location for alphaCoach:" +alphaCoach +"\n");
		
		//close the context 
		context.close();


	}

}
;