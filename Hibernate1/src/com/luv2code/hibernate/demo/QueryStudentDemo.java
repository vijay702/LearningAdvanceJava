package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.fasterxml.classmate.AnnotationConfiguration;
import com.luv2code.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
	

	
		SessionFactory factory = new Configuration()
				                 .configure()
				                 .addAnnotatedClass(Student.class)
				                 .buildSessionFactory();
		
		
		
		// query HQL
		
		//create session
		Session session = factory.getCurrentSession();
		
		try {
			
			
			//strat a transaction 
			session.beginTransaction();
			
			
			//query the students
			List<Student> theStudents = session.createQuery("from Student").list();
			
			//display the students 
			
			diaplayStudents(theStudents);
			
			//query students : lastName=ranjini
			
			
			theStudents = session.createQuery("from Student s where s.lastName='ranjini' ").list();
			
			
			//display the students 
			System.out.println("student who have lastname of ranjini");
	
			
			
			//query students : lastName=ranjini  or firstname vijay
			System.out.println("*******************");
			System.out.println("student who have lastname of ranjini or first name of vijay ");
			theStudents = session.createQuery("from Student s where s.lastName='ranjini'  OR s.firstName='vijay' ").list();
			
			// display the students ;
			diaplayStudents(theStudents);
			System.out.println("************************");
			
			//query students where mail lke vijay@luv2coed.com
			theStudents = session.createQuery("from Student s where " + "s.email LIKE '%luv2code.com' ").list();
			
			
			
			System.out.println("***********");
			diaplayStudents(theStudents);
			
			
			// Commit transaction
			session.getTransaction().commit();
			System.out.println("done!!!!!!");
			
		}finally {
			
			factory.close();
			System.out.println("*************");
		}
		
		
		
		
		
	}
              // method for display the students 
	private static void diaplayStudents(List<Student> theStudents) {
		for (Student tempStudent : theStudents) {
			
			System.out.println(tempStudent);
		}
	}
	
	

}
