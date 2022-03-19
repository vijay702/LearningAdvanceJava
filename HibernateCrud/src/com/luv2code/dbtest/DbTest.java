package com.luv2code.dbtest;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbTest {

	public static void main(String[] args) {
	
		
		// db variables 
		
		String user = "springstudent1";
		String password = "springstudent1";
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker1?useSSL=false&serverTimezone=UTC";
		
		
		try {
			
			
			System.out.println("Conneting to a database "+jdbcUrl);
			
			Connection myconn = DriverManager.getConnection(jdbcUrl,user,password);
			
			
			System.out.println("\nConnection SucessFuulll");
			
			
		}catch (Exception exc) {
			
			exc.printStackTrace();
			
			
		}
		
		
		
		
		

	}

}
