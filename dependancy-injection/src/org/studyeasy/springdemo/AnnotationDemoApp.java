package org.studyeasy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
	
		
		// application context read config file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrive beans from spring container 
		
		
		Coach theCoach = context.getBean("basketBallCoach",Coach.class);
		
		// call methods opn bean 
		
        theCoach.getDailyworkout();
        System.out.println( theCoach.getDailyworkout());
        System.out.println(theCoach.getDailyFortune());
		
		
		// closae the context 
          context.close();
	}

}
