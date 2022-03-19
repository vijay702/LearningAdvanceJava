package org.studyeasy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApllicationDemo {

	public static void main(String[] args) {
	
		//create spring confif file
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("SpringConfig.class");
		
		
		// retrive Beans from Spring Container
		
		Movies movie = context.getBean("master",Movies.class);
		
		
		// printing methods 
		System.out.println(movie.WatchMovie());
		
		
		//close the context 
		context.close();
		

	}

}
