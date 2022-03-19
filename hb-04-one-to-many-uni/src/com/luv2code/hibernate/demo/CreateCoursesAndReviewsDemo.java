package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Coursec;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Review;


public class CreateCoursesAndReviewsDemo {

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
			
			// create a  course
			
			Coursec tempCourse = new Coursec ("Pacman- How To Score One Million Points ");
			
			//add some reviews
			tempCourse.addReview(new Review ("great course .............loved it "));
			tempCourse.addReview(new Review ("cool course .............loved it "));
			tempCourse.addReview(new Review ("What a dumb , you are an idiot "));

			
			
			
			//save the course ............ and levarage the cascade all :-)
			System.out.println("saving the course");
            System.out.println(tempCourse);
            System.out.println(tempCourse.getReviews());
			session.save(tempCourse);
			
			
			
			
			
	
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
