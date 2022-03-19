package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Coursec;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;


public class EagerLazyDemo {

	public static void main(String[] args) {
	

	
		SessionFactory factory = new Configuration()
				                 .configure()
				                 .addAnnotatedClass(Instructor.class)
				                 .addAnnotatedClass(InstructorDetail.class)
				                 .addAnnotatedClass(Coursec.class)
				                 .buildSessionFactory();
		
		
		
		
		
		//create session
		Session session = factory.getCurrentSession();
		
		try {
	
			
			//strat a transaction 
			session.beginTransaction();
			System.out.println("****************************");
			
			
			// get the instructor from db 
			int theId=1;
			
			Instructor tempInstructor =session.get(Instructor.class,theId);
			
			System.out.println("*******luv Instructor"+tempInstructor);
			
			//get course for the instructors 
			
			
			tempInstructor.getCourses();
			System.out.println("************"+	tempInstructor.getCourses());
		
			
			// Commit transaction
			session.getTransaction().commit();
			
			session.close();
			
			System.out.println("\nThe Session is closed ");
			System.out.println("************************************");
			
			
			System.out.println("************"+	tempInstructor.getCourses());
			
			System.out.println("done!!!!!!");
			
		}finally {
			// add clean up code 
			session.close();
			factory.close();
			System.out.println("*************");
		}
		
		
		
		
		
	}
	
	

}
