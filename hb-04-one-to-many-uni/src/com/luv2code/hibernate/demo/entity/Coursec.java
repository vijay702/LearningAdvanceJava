package com.luv2code.hibernate.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Coursec {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="title")
	private String title;
	
	@ManyToOne(cascade= {CascadeType.DETACH, CascadeType.PERSIST,CascadeType.REFRESH,CascadeType.MERGE })
	@JoinColumn(name="instructor_id")
	private Instructor instructor;
	
	@OneToMany(fetch=FetchType.LAZY ,  cascade=CascadeType.ALL)
	@JoinColumn(name="course_id")
	private List<Review> reviews;
	
	@ManyToMany(fetch=FetchType.LAZY,cascade= {CascadeType.DETACH, CascadeType.PERSIST,CascadeType.REFRESH,CascadeType.MERGE })
	@JoinTable( name="course_student",
	           joinColumns=@JoinColumn(name="course_id"),
                inverseJoinColumns= @JoinColumn(name="student_id")	
			)
	private List<Student> students;
	
	
	public List<Student> getStudents() {
		return students;
	}




	public void setStudents(List<Student> students) {
		this.students = students;
	}




	public List<Review> getReviews() {
		return reviews;
	}


	

	public Coursec() {
		
	}


	public Coursec(String title) {
		this.title = title;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Instructor getInstructor() {
		return instructor;
	}


	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}


	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + "]";
	}
	
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
	
	
	// add a convience method 
	
	
	public void addReview (Review theReview) {
		
		if (reviews == null ) {
			
			reviews = new ArrayList <>();
		}
		
		reviews.add(theReview);
		
		
	}
	
	// add a convient method to
	
    public void addStudent (Student theStudent) {
    	
    	if (students == null) {
    		students = new ArrayList<>();
    	}
    	
    	students.add(theStudent);
    	
    	
    }

}
