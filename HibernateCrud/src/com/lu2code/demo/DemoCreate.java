package com.lu2code.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.entity.Student;

public class DemoCreate {

	public static void main(String[] args) {
		
		
		
		SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

		
		
		// create a session
		
		Session session = factory.getCurrentSession();
		
		
		try {
			
			//begin transaction
			
			session.beginTransaction();
			System.out.println("Tranasction begin ");
			
			//find the id to delete 
			int theId=1;
			
			Student tempStudent = session.get(Student.class,theId);
			
			

			
			//save the object 
			
			if (tempStudent !=null) {
				
				
				
				
				
			System.out.println("processing");
			
			
			
			
			session.delete(tempStudent);
			}
			//commit the transaction\
			session.getTransaction().commit();
			
			
			
			
				
		
		} finally {
			
			session.close();
			factory.close();
			
			
		}
		
		
		
		
	}
	

}
