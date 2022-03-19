package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {
	

	
		SessionFactory factory = new Configuration()
				                 .configure()
				                 .addAnnotatedClass(Student.class)
				                 .buildSessionFactory();
		
		
		
		
		
		//create session
		Session session = factory.getCurrentSession();
		
		try {
		 
			int studentId=3;
			
			// now get a  new sessiion and start a transaction 
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			//retrive stuent based on the id : primary key
			
			System.out.println("\nGetting Start With Stuent ID" +studentId);
			
			Student myStudent = session.get(Student.class, studentId);
			
			
			System.out.println("Updating Student.....");
			myStudent.setFirstName("ram");
			//commit the transaction 	
			
			session.getTransaction().commit(); 
			System.out.println("***************");
			
			
			
			// new code 
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			
			//update email for all students 
			
			System.out.println("update  email for all stuents");
			session.createQuery("update Student set email='luv2.com' ").executeUpdate();
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("done!!!!!!");

			
		}finally {
			
			factory.close();
			System.out.println("*************");
		}
		
		
		
		
		
	}
	
	

}
