package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;


public class DeleteInstructorDetailDemo {

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
	
		// get the instructor detail object
			int theId= 6;
			InstructorDetail tempInstructorDetail = session.get(InstructorDetail.class, theId);
			
			
			
		// print the instructor detail
			
			System.out.println("tempinstructorDetail"+tempInstructorDetail);
			
	
				
	
			// print out the associate instructor
			System.out.println("the associated instructor " +tempInstructorDetail.getInstructor());
			
			//delete the instructor detail
			// remove the assopciated object refrence
			//break bi-directional link
			
			
			tempInstructorDetail.getInstructor().setInstructorDetail(null);
			
			System.out.println("deleting instructor detail"+tempInstructorDetail );
			
			session.delete(tempInstructorDetail);
			
			
			// Commit transaction
			session.getTransaction().commit();
			System.out.println("done!!!!!!");
			
		}
		catch (Exception exc) {
			
			exc.printStackTrace();
		}
		
		
		
		finally {
			//handle connection close issue 
			session.close();
			
			factory.close();
			System.out.println("*************");
		}
		
		
		
		
		
	}
	
	

}
