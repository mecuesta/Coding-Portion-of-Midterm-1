package com.cisc181.core;

import java.util.ArrayList;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// Create a Course ArrayList and Add three records to it
		ArrayList<Course> CourseList = new ArrayList<Course>();
		Course course1 = new Course();
		Course course2 = new Course();
		Course course3 = new Course();
		CourseList.add(course1);
		CourseList.add(course2);
		CourseList.add(course3);
		
		// Create a Semester ArrayList and Add two Semesters to it
		ArrayList<Semester> SemesterList = new ArrayList<Semester>();
		Semester fall_semester = new Semester();
		Semester spring_semester = new Semester();
		SemesterList.add(fall_semester);
		SemesterList.add(spring_semester);
		
		// Create a Section ArrayList and add 6 sections to it
		ArrayList<Section> SectionList = new ArrayList<Section>();
		Section course1semester1 = new Section();
		Section course2semester1 = new Section();
		Section course3semester1 = new Section();
		Section course1semester2 = new Section();
		Section course2semester2 = new Section();
		Section course3semester2 = new Section();
		SectionList.add(course1semester1);
		SectionList.add(course2semester1);
		SectionList.add(course3semester1);
		SectionList.add(course1semester2);
		SectionList.add(course2semester2);
		SectionList.add(course3semester2);
		
		// Create a Student ArrayList and Add 10 records to it
		ArrayList<Student> StudentList = new ArrayList<Student>();
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		Student student4 = new Student();
		Student student5 = new Student();
		Student student6 = new Student();
		Student student7 = new Student();
		Student student8 = new Student();
		Student student9 = new Student();
		Student student10 = new Student();
		StudentList.add(student1);
		StudentList.add(student2);
		StudentList.add(student3);
		StudentList.add(student4);
		StudentList.add(student5);
		StudentList.add(student6);
		StudentList.add(student7);
		StudentList.add(student8);
		StudentList.add(student9);
		StudentList.add(student10);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	/*
	 * All of this creates an error, can't find a way to use the instances I used in the setUpBeforeClass() method above.
	@Test
	public void testEnrollment() {
		Enrollment(setUpBeforeClass().student1.getStudentID(), setUpBeforeClass().course1semester1.getSectionID());
		Enrollment(setUpBeforeClass().student1.getStudentID(), setUpBeforeClass().course2semester1.getSectionID());
		Enrollment(setUpBeforeClass().student1.getStudentID(), setUpBeforeClass().course3semester1.getSectionID());
		Enrollment(setUpBeforeClass().student1.getStudentID(), setUpBeforeClass().course1semester2.getSectionID());
		Enrollment(setUpBeforeClass().student1.getStudentID(), setUpBeforeClass().course2semester2.getSectionID());
		Enrollment(setUpBeforeClass().student1.getStudentID(), setUpBeforeClass().course3semester2.getSectionID());
		
		Enrollment(setUpBeforeClass().student2.getStudentID(), setUpBeforeClass().course1semester1.getSectionID());
		Enrollment(setUpBeforeClass().student2.getStudentID(), setUpBeforeClass().course2semester1.getSectionID());
		Enrollment(setUpBeforeClass().student2.getStudentID(), setUpBeforeClass().course3semester1.getSectionID());
		Enrollment(setUpBeforeClass().student2.getStudentID(), setUpBeforeClass().course1semester2.getSectionID());
		Enrollment(setUpBeforeClass().student2.getStudentID(), setUpBeforeClass().course2semester2.getSectionID());
		Enrollment(setUpBeforeClass().student2.getStudentID(), setUpBeforeClass().course3semester2.getSectionID());
		
		Enrollment(setUpBeforeClass().student3.getStudentID(), setUpBeforeClass().course1semester1.getSectionID());
		Enrollment(setUpBeforeClass().student3.getStudentID(), setUpBeforeClass().course2semester1.getSectionID());
		Enrollment(setUpBeforeClass().student3.getStudentID(), setUpBeforeClass().course3semester1.getSectionID());
		Enrollment(setUpBeforeClass().student3.getStudentID(), setUpBeforeClass().course1semester2.getSectionID());
		Enrollment(setUpBeforeClass().student3.getStudentID(), setUpBeforeClass().course2semester2.getSectionID());
		Enrollment(setUpBeforeClass().student3.getStudentID(), setUpBeforeClass().course3semester2.getSectionID());
		
		Enrollment(setUpBeforeClass().student4.getStudentID(), setUpBeforeClass().course1semester1.getSectionID());
		Enrollment(setUpBeforeClass().student4.getStudentID(), setUpBeforeClass().course2semester1.getSectionID());
		Enrollment(setUpBeforeClass().student4.getStudentID(), setUpBeforeClass().course3semester1.getSectionID());
		Enrollment(setUpBeforeClass().student4.getStudentID(), setUpBeforeClass().course1semester2.getSectionID());
		Enrollment(setUpBeforeClass().student4.getStudentID(), setUpBeforeClass().course2semester2.getSectionID());
		Enrollment(setUpBeforeClass().student4.getStudentID(), setUpBeforeClass().course3semester2.getSectionID());
		
		Enrollment(setUpBeforeClass().student5.getStudentID(), setUpBeforeClass().course1semester1.getSectionID());
		Enrollment(setUpBeforeClass().student5.getStudentID(), setUpBeforeClass().course2semester1.getSectionID());
		Enrollment(setUpBeforeClass().student5.getStudentID(), setUpBeforeClass().course3semester1.getSectionID());
		Enrollment(setUpBeforeClass().student5.getStudentID(), setUpBeforeClass().course1semester2.getSectionID());
		Enrollment(setUpBeforeClass().student5.getStudentID(), setUpBeforeClass().course2semester2.getSectionID());
		Enrollment(setUpBeforeClass().student5.getStudentID(), setUpBeforeClass().course3semester2.getSectionID());
		
		Enrollment(setUpBeforeClass().student6.getStudentID(), setUpBeforeClass().course1semester1.getSectionID());
		Enrollment(setUpBeforeClass().student6.getStudentID(), setUpBeforeClass().course2semester1.getSectionID());
		Enrollment(setUpBeforeClass().student6.getStudentID(), setUpBeforeClass().course3semester1.getSectionID());
		Enrollment(setUpBeforeClass().student6.getStudentID(), setUpBeforeClass().course1semester2.getSectionID());
		Enrollment(setUpBeforeClass().student6.getStudentID(), setUpBeforeClass().course2semester2.getSectionID());
		Enrollment(setUpBeforeClass().student6.getStudentID(), setUpBeforeClass().course3semester2.getSectionID());
		
		Enrollment(setUpBeforeClass().student7.getStudentID(), setUpBeforeClass().course1semester1.getSectionID());
		Enrollment(setUpBeforeClass().student7.getStudentID(), setUpBeforeClass().course2semester1.getSectionID());
		Enrollment(setUpBeforeClass().student7.getStudentID(), setUpBeforeClass().course3semester1.getSectionID());
		Enrollment(setUpBeforeClass().student7.getStudentID(), setUpBeforeClass().course1semester2.getSectionID());
		Enrollment(setUpBeforeClass().student7.getStudentID(), setUpBeforeClass().course2semester2.getSectionID());
		Enrollment(setUpBeforeClass().student7.getStudentID(), setUpBeforeClass().course3semester2.getSectionID());
		
		Enrollment(setUpBeforeClass().student8.getStudentID(), setUpBeforeClass().course1semester1.getSectionID());
		Enrollment(setUpBeforeClass().student8.getStudentID(), setUpBeforeClass().course2semester1.getSectionID());
		Enrollment(setUpBeforeClass().student8.getStudentID(), setUpBeforeClass().course3semester1.getSectionID());
		Enrollment(setUpBeforeClass().student8.getStudentID(), setUpBeforeClass().course1semester2.getSectionID());
		Enrollment(setUpBeforeClass().student8.getStudentID(), setUpBeforeClass().course2semester2.getSectionID());
		Enrollment(setUpBeforeClass().student8.getStudentID(), setUpBeforeClass().course3semester2.getSectionID());
		
		Enrollment(setUpBeforeClass().student9.getStudentID(), setUpBeforeClass().course1semester1.getSectionID());
		Enrollment(setUpBeforeClass().student9.getStudentID(), setUpBeforeClass().course2semester1.getSectionID());
		Enrollment(setUpBeforeClass().student9.getStudentID(), setUpBeforeClass().course3semester1.getSectionID());
		Enrollment(setUpBeforeClass().student9.getStudentID(), setUpBeforeClass().course1semester2.getSectionID());
		Enrollment(setUpBeforeClass().student9.getStudentID(), setUpBeforeClass().course2semester2.getSectionID());
		Enrollment(setUpBeforeClass().student9.getStudentID(), setUpBeforeClass().course3semester2.getSectionID());
		
		Enrollment(setUpBeforeClass().student10.getStudentID(), setUpBeforeClass().course1semester1.getSectionID());
		Enrollment(setUpBeforeClass().student10.getStudentID(), setUpBeforeClass().course2semester1.getSectionID());
		Enrollment(setUpBeforeClass().student10.getStudentID(), setUpBeforeClass().course3semester1.getSectionID());
		Enrollment(setUpBeforeClass().student10.getStudentID(), setUpBeforeClass().course1semester2.getSectionID());
		Enrollment(setUpBeforeClass().student10.getStudentID(), setUpBeforeClass().course2semester2.getSectionID());
		Enrollment(setUpBeforeClass().student10.getStudentID(), setUpBeforeClass().course3semester2.getSectionID());
		
		ArrayList<Course> gradepoints_student1 = new ArrayList<Course>();
		gradepoints_student1.add(95);
		gradepoints_student1.add(95);
		gradepoints_student1.add(95);
		gradepoints_student1.add(95);
		gradepoints_student1.add(95);
		gradepoints_student1.add(95);
		
		ArrayList<Course> gradepoints_student2 = new ArrayList<Course>();
		gradepoints_student2.add(100);
		gradepoints_student2.add(100);
		gradepoints_student2.add(100);
		gradepoints_student2.add(100);
		gradepoints_student2.add(95);
		gradepoints_student2.add(75);
		
		ArrayList<Course> gradepoints_student3 = new ArrayList<Course>();
		gradepoints_student3.add(60);
		gradepoints_student3.add(60);
		gradepoints_student3.add(60);
		gradepoints_student3.add(60);
		gradepoints_student3.add(60);
		gradepoints_student3.add(60);
		
		ArrayList<Course> gradepoints_student4 = new ArrayList<Course>();
		gradepoints_student4.add(80);
		gradepoints_student4.add(100);
		gradepoints_student4.add(50);
		gradepoints_student4.add(70);
		gradepoints_student4.add(100);
		gradepoints_student4.add(40);
		
		ArrayList<Course> gradepoints_student5 = new ArrayList<Course>();
		gradepoints_student5.add(90);
		gradepoints_student5.add(85);
		gradepoints_student5.add(80);
		gradepoints_student5.add(75);
		gradepoints_student5.add(70);
		gradepoints_student5.add(65);
		
		ArrayList<Course> gradepoints_student6 = new ArrayList<Course>();
		gradepoints_student6.add(100);
		gradepoints_student6.add(100);
		gradepoints_student6.add(95);
		gradepoints_student6.add(90);
		gradepoints_student6.add(85);
		gradepoints_student6.add(75);
		
		ArrayList<Course> gradepoints_student7 = new ArrayList<Course>();
		gradepoints_student7.add(80);
		gradepoints_student7.add(80);
		gradepoints_student7.add(80);
		gradepoints_student7.add(80);
		gradepoints_student7.add(80);
		gradepoints_student7.add(80);
		
		ArrayList<Course> gradepoints_student8 = new ArrayList<Course>();
		gradepoints_student8.add(75);
		gradepoints_student8.add(75);
		gradepoints_student8.add(75);
		gradepoints_student8.add(75);
		gradepoints_student8.add(75);
		gradepoints_student8.add(75);
		
		ArrayList<Course> gradepoints_student9 = new ArrayList<Course>();
		gradepoints_student9.add(90);
		gradepoints_student9.add(90);
		gradepoints_student9.add(90);
		gradepoints_student9.add(90);
		gradepoints_student9.add(90);
		gradepoints_student9.add(90);
		
		ArrayList<Course> gradepoints_student10 = new ArrayList<Course>();
		gradepoints_student10.add(100);
		gradepoints_student10.add(100);
		gradepoints_student10.add(100);
		gradepoints_student10.add(100);
		gradepoints_student10.add(100);
		gradepoints_student10.add(100);
		
		TO GET THE GPA OF EACH STUDENT, RUN A FOR LOOP IN WHICH THE LOOP GETS THE 
		INDEX FOR THE GRADEPOINTS FOR THAT STUDENT
		
		int index = 0;
		ArrayList<String> Course_GPA = new ArrayList<String>();
		for (int index; index < 6; index++) {
			if (gradepoints_student1[index] >= 92) {
				Course_GPA.add("A");				
			} else if (90 <= gradepoints_student1[index] < 92) {
				Course_GPA.add("B");
				......................... WOULD CONTINUE THIS FOR ALL LETTER GRADES
				AND THEN WOULD CREATE MORE LOOPS THAT WOULD EXTRACT THE LETTER GRADES
				AND CREATE A GPA ON A SCALE OF 0 TO 4 IN WHICH A CORRESPONDS TO 4,
				SON ON AND SO FORTH
			}			
		}
		
		AND TO FIND THE COURSE AVERAGE
		
		index = 0;
		ArrayList<Integer> course_avg = new ArrayList<Integer>();
		for (int index; index < 5; index++) {
			course_avg.add((gradepoints_student1[index] + gradepoints_student2[index] +........+ gradepoints_student10[index])/5);
			
		THE ABOVE FOR LOOP WILL ADD AN INTEGER THE ARRAYLIST THAT WILL HOLD THE AVERAGE FOR ONE CLASS OVER ALL OF THE STUDENTS SCORES FOR THAT CLASS
		}
		
		TO CHANGE ONE OF THE STUDENTS MAJORS:
		
		if (student1.getMajor() = eTitle.CHEM) {
			student1.eTitle.PHYSICS;
		} else {
			student1.eTitle.CHEM;
		}
	}SORRY IF THIS CODE IS NOT WHAT YOU ARE LOOKING FOR, BLANKED OUT ON THE WHOLE JUNIT TESTING FOR THE MOST PART BUT TRIED MY BEST. THANK YOU*/

}
