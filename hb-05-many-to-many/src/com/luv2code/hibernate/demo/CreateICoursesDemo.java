package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Coursec;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;


public class CreateICoursesDemo {

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
			int theId=2;
			
			Instructor tempInstructor =session.get(Instructor.class,theId);
			
			
			
			//create some courses
			Coursec tempCourse1 = new Coursec ("Air Guitar - the ultimate boook");
			
			Coursec tempCourse2 = new Coursec ("the pin ball master-cook");
			
			// add courses to instructor
            tempInstructor.add(tempCourse1);
            tempInstructor.add(tempCourse2);
			
			//  save the courses
			session.save(tempCourse1);
			session.save(tempCourse2);
			
			// Commit transaction
			session.getTransaction().commit();
			System.out.println("done!!!!!!");
			
		}finally {
			// add clean up code 
			session.close();
			factory.close();
			System.out.println("*************");
		}
		
		
		
		
		
	}
	
	

}
