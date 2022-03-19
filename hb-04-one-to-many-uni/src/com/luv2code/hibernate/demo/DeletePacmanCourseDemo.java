package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Coursec;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Review;
import com.luv2code.hibernate.demo.entity.Student;


public class DeletePacmanCourseDemo {

	public static void main(String[] args) {
	

	
		SessionFactory factory = new Configuration()
				                 .configure()
				                 .addAnnotatedClass(Instructor.class)
				                 .addAnnotatedClass(InstructorDetail.class)
				                 .addAnnotatedClass(Coursec.class)
				                 .addAnnotatedClass(Review.class)
				                 .addAnnotatedClass(Student.class)
				                 .buildSessionFactory();
		
		
		
		
		
		//create session
		Session session = factory.getCurrentSession();
		
		try {
	
			
			//strat a transaction 
			session.beginTransaction();
			System.out.println("transaction started");
			
			
			//get the pacman course from db
			int courseId=12;
			
			Coursec tempCourse  = session.get(Coursec.class,courseId);
			
			
			
			//delete the course 
			System.out.println("deleting a course"+tempCourse);
			
			session.delete(tempCourse);
			
			
			
			
		
		
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
