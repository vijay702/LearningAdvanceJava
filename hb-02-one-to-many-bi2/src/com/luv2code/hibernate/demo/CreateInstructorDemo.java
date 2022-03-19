package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Coursec;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;


public class CreateInstructorDemo {

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
			
		//create the objects 
			Instructor tempInstructor = new Instructor("vijay","titus","vijayyes15@outlook.com");
			
			InstructorDetail tempInstructorDetail = new InstructorDetail("http://www.luv2code.com/youtube", "luv2code");
			
			
			// associate the objects 
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			
			
			//strat a transaction 
			session.beginTransaction();
			System.out.println("****************************");
			
			
			// save the instructor 
			//note this will also save the details object
			// because of cascadetype.all
			System.out.println("saving instructor : " +tempInstructor);
			session.save(tempInstructor);
			
			
			
			
			
			
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
