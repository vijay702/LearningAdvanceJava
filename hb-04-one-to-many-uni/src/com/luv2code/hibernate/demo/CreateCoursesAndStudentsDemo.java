package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Coursec;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Review;
import com.luv2code.hibernate.demo.entity.Student;


public class CreateCoursesAndStudentsDemo {

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
			
			// create a  course
			
			Coursec tempCourse = new Coursec ("Pacman- How To Score One Million gardes ");
			
	
			// save the course 
			System.out.println("\nSaving A Course");
			session.save(tempCourse);
			System.out.println("\nSave Course"+tempCourse);
			
			// create  the students 
			
			
			Student tempStudent1 = new Student("John ","vijay","john2MAIL.COM");
			Student tempStudent2 = new Student("vijay ","karl","vk@S.COM");
			
			//add students to the course 
			tempCourse.addStudent(tempStudent1);
            tempCourse.addStudent(tempStudent2);		
			
			
			//save the students 
			System.out.println("\nSaving a course...........................");
		   session.save(tempStudent1);
		   session.save(tempStudent2);
			System.out.println("\nSaved Students"+tempStudent1 + tempStudent2);
			
			
			
	
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
