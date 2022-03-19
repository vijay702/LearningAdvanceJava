package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class PrimaryKeryDemo {

	public static void main(String[] args) {
		

		
		SessionFactory factory = new Configuration()
				                 .configure()
				                 .addAnnotatedClass(Student.class)
				                 .buildSessionFactory();
		
		
		
		
		
		//create session
		Session session = factory.getCurrentSession();
		
		try {
			
			// create 3  student object`
			System.out.println("creating 3 student object ");
			Student tempStudent1 = new Student("ram", "dfsdf", "dfdsf@dsdfg.com");
			Student tempStudent2 = new Student("vijay", "titus", "djghfijbfd");
			Student tempStudent3 = new Student("siva", "ranjini", "ranjini@w.com");
			
			//strat a transaction 
			session.beginTransaction();
			
			// save the student object 
			System.out.println("saving the Students  ");
			session.save(tempStudent1);
			session.save(tempStudent2);
			session.save(tempStudent3);
			
			
			// Commit transaction
			session.getTransaction().commit();
			System.out.println("done!!!!!!");
			
		}finally {
			
			factory.close();
			System.out.println("*************");
		}
		
		
		
		
		
	}
}
