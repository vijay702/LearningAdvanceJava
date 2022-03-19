package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;


public class DeleteDemo {

	public static void main(String[] args) {
	

	
		SessionFactory factory = new Configuration()
				                 .configure()
				                 .addAnnotatedClass(Instructor.class)
				                 .addAnnotatedClass(InstructorDetail.class)
				                 .buildSessionFactory();
		
		
		
		
		
		//create session
		Session session = factory.getCurrentSession();
		
		try {
		
			
			//strat a transaction 
			session.beginTransaction();
			System.out.println("****************************");
			
		//get instructor by primary key / id 
			int theId =2;
			
			Instructor tempInstructor = session.get(Instructor.class, theId);
			
			
			System.out.println("Found instructor "+ tempInstructor);
			
		//delete the instructors 
			
		if(tempInstructor !=null) {
			
			System.out.println("Deleting " +tempInstructor);
			
			// note : willl also deletr associate "details" object 
			//because cascade.type.all
			session.delete(tempInstructor);
		}
				
	
		//commit transaction
			
			
			
			
			// Commit transaction
			session.getTransaction().commit();
			System.out.println("done!!!!!!");
			
		}finally {
			
			factory.close();
			System.out.println("*************");
		}
		
		
		
		
		
	}
	
	

}
