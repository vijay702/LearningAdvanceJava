package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class DeleteStudentDemo {

	public static void main(String[] args) {
	

	
		SessionFactory factory = new Configuration()
				                 .configure()
				                 .addAnnotatedClass(Student.class)
				                 .buildSessionFactory();
		
		
		
		
		
		//create session
		Session session = factory.getCurrentSession();
		
		try {
		 
			int studentId=1;
			
			// now get a  new sessiion and start a transaction 
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			//retrive stuent based on the id : primary key
			
			System.out.println("\nGetting Start With Stuent ID" +studentId);
			
			Student myStudent = session.get(Student.class, studentId);
			
			// delete the student
//			System.out.println("deleting student"+myStudent);
//			session.delete(myStudent);
			
			
			
			
			// delete student id=2
			System.out.println("deleting stuent id =2 ");
			session.createQuery("delete from Student where id=2").executeUpdate();
			
			//commi
		
			session.getTransaction().commit(); 
			System.out.println("***************");
			
			
		
			System.out.println("done!!!!!!");

			
		}finally {
			
			factory.close();
			System.out.println("*************");
		}
		
		
		
		
		
	}
	
	

}
