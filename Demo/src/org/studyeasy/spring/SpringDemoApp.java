package org.studyeasy.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemoApp {

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("Appconfig.class");
		
		
		SoftwareService theService = context.getBean("softwareService",SoftwareService.class);
		
		
		System.out.println(theService.GivingSerice());
		
		
		context.close();

	}

}
