package org.studyeasy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		
		//load the spring configuration file 
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//retrive  bean from spring container 
		Coach theCoach = context.getBean("myCoach" ,Coach.class);
		
		//call methods on bean
		
		System.out.println(theCoach.getDailyWorkout());
		
		//lets call the our new method 
		System.out.println(theCoach.getFortune());
		
		//close the context 
		context.close();

	}

}
