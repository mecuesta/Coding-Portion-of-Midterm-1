package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	private Enrollment() {
		this.SectionID = SectionID;
		this.StudentID = StudentID;
	}
	
	
	public UUID getSectionID() {
		return SectionID;
	}


	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}


	public UUID getStudentID() {
		return StudentID;
	}


	public void setStudentID(UUID studentID) {
		StudentID = studentID;
	}


	public double getGrade(double Grade) {
		return this.Grade;
	}
	
	public void setGrade(double Grade) {
		this.Grade = Grade;
	}
	
	public Enrollment(UUID StudentID, UUID SectionID) {
		this.EnrollmentID = EnrollmentID;		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
