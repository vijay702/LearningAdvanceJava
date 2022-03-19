package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
	

	
		SessionFactory factory = new Configuration()
				                 .configure()
				                 .addAnnotatedClass(Student.class)
				                 .buildSessionFactory();
		
		
		
		
		
		//create session
		Session session = factory.getCurrentSession();
		
		try {
			
			// create a new student object`
			System.out.println("creating new student object ");
			Student tempStudent = new Student("vijay", "titus", "vijay@luv2coed.com");
			
			//strat a transaction 
			session.beginTransaction();
			
			// save the student object 
			System.out.println("saving the object ");
			System.out.println(tempStudent);
			session.save(tempStudent);
			
			
			// Commit transaction
			session.getTransaction().commit();
			
			
			//new code for retriving 
			//find out the students id: primary key
			System.out.println("saved student, genarate id" +tempStudent.getId());
			
			
			
			// now get a  new sessiion and start a transaction 
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			//retrive stuent based on the id : primary key
			
			System.out.println("\nGetting Start With Stuent ID" +tempStudent.getId());
			
			Student myStudent = session.get(Student.class, tempStudent.getId());
			System.out.println("Get Complete My Student " +myStudent);
			//commit the transaction 	
			
			session.getTransaction().commit(); 
			
			System.out.println("done!!!!!!");
			
		}finally {
			
			factory.close();
			System.out.println("*************");
		}
		
		
		
		
		
	}
	
	

}
