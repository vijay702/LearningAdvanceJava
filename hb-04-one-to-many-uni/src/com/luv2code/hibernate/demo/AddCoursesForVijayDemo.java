package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Coursec;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Review;
import com.luv2code.hibernate.demo.entity.Student;


public class AddCoursesForVijayDemo {

	public static void main(String[] args) {
	

	
		SessionFactory factory = new Configuration()
				                 .configure()
				                 .addAnnotatedClass(Instructor.class)
				                 .addAnnotatedClass(InstructorDetail.class)
				                 .addAnnotatedClass(Coursec.class)
				                 .addAnnotatedClass(Review.class)
				                 .addAnnotatedClass(Student.class)
				                 .buildSessionFactory();
		
		
		
		
		
		//create session
		Session session = factory.getCurrentSession();
		
		try {
	
			
			//strat a transaction 
			session.beginTransaction();
			System.out.println("transaction started");
			
			// get the student from a database 
			
			int theId=3;
			
			Student tempStudent =session.get(Student.class, theId);
			
			System.out.println("loadaed"+tempStudent);
			System.out.println("\nGetting Courses"+tempStudent.getCourses());
			//create more courses
			
			Coursec tempCourse1 = new Coursec ("Pacman- How To Score One Million man ");
			Coursec tempCourse2 = new Coursec ("Spring And HiberNate  ");
			Coursec tempCourse3 = new Coursec ("Mavenn crash Course ");
			
			//add student to the courses
			tempCourse1.addStudent(tempStudent);
			tempCourse2.addStudent(tempStudent);
			tempCourse3.addStudent(tempStudent);
			
			//save the courses
			System.out.println("\n Saving courses");
			session.save(tempCourse1);
			session.save(tempCourse2);
			session.save(tempCourse3);
			System.out.println("coures saved ***************************");
	
			// Commit transaction
			session.getTransaction().commit();
			System.out.println("done!!!!!!");
			
		}finally {
			// add clean up code 
			session.close();
			System.out.println("session closed ");
			factory.close();
			
		}
		
		
		
		
		
	}
	
	

}
