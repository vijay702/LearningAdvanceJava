package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.luv2code.hibernate.demo.entity.Coursec;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;


public class FetchJoinDemo {

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
			
			
			//option 2: hibernate query HQL
			
			int theId=1;
			
			Query<Instructor> query = session.createQuery("select i from instructor"
					+ "JOIN FETCH i.courses"
					+ "where i.id=:theInstructorId" ,
					
					Instructor.class);
			
			//set parameter on query
			
			query.setParameter("theInstructorId", theId);
			
			//execute query and get instructor 
			Instructor tempInstructor =query.getSingleResult();
			
			
			System.out.println("luv2code.com,,"+tempInstructor);
			
			
			
			
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
