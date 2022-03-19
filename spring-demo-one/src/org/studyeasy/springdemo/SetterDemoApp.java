package org.studyeasy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

	// load the spring config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		

	//retrive bean from spring containber
		CricketCoach thecoach = context.getBean("myricketCoach",CricketCoach.class);
		

		//call methods to bean
		//lets comeback to this 
		System.out.println(thecoach.getDailyWorkout());
		System.out.println(thecoach.getFortune());
		//call our new methods 
		System.out.println(thecoach.getEmailAddress());
		System.out.println(thecoach.getTeam());
		
		// close the context
		context.close();
		
		
		
	}

}
