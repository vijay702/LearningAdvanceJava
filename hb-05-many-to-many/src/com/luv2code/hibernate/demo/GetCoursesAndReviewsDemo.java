package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Coursec;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Review;


public class GetCoursesAndReviewsDemo {

	public static void main(String[] args) {
	

	
		SessionFactory factory = new Configuration()
				                 .configure()
				                 .addAnnotatedClass(Instructor.class)
				                 .addAnnotatedClass(InstructorDetail.class)
				                 .addAnnotatedClass(Coursec.class)
				                 .addAnnotatedClass(Review.class)
				                 .buildSessionFactory();
		
		
		
		
		
		//create session
		Session session = factory.getCurrentSession();
		
		try {
	
			
			//strat a transaction 
			session.beginTransaction();
			System.out.println("transaction started");
		
			
			// get the course 
			int theId =10;
			
			Coursec tempCourse = session.get(Coursec.class,theId);
			
			
			// print course 
			System.out.println("course name"+tempCourse);
			
			
			//print the course review
			
			System.out.println(tempCourse.getReviews());
			
			
			//delete Course and reviews 
			
		
			// Commit transaction
			session.getTransaction().commit();
			System.out.println("done!!!!!!");
			
		}finally {
			// add clean up code 
			session.close();
			System.out.println("session closed ");
			factory.close();
			
		}
		
		
		
		
		
	}
	
	

}
