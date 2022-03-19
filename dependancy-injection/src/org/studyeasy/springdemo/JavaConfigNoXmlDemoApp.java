package org.studyeasy.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigNoXmlDemoApp {

	public static void main(String[] args) {
	
		
		// application context read config file
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
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
