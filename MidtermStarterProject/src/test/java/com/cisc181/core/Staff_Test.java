package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import com.cisc181.core.Person;

import com.cisc181.eNums.eTitle;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {
	
	private Date Invalid_DOB;
	private static int salary1 = 50000;
	private static int salary2 = 40000;
	private static int salary3 = 60000;
	private static int salary4 = 35000;
	private static int salary5 = 45000;
	
	private static Staff newStaff1 = new Staff(eTitle.PROFESSOR);
	private static Staff newStaff2 = new Staff(eTitle.TEACHER);
	private static Staff newStaff3 = new Staff(eTitle.PROFESSOR);
	private static Staff newStaff4 = new Staff(eTitle.MISTER);
	private static Staff newStaff5 = new Staff(eTitle.TEACHER);
	
	private static Employee employee1 = new Employee();
	private static Employee employee2 = new Employee();
	private static Employee employee3 = new Employee();
	private static Employee employee4 = new Employee();
	private static Employee employee5 = new Employee();
	
	private static String invalid_phone_number = "123489";
	private static Calendar birthDate = Calendar.getInstance();
	
			
	private static ArrayList<Staff> ListofAllStaff = new ArrayList<Staff>();
	private static ArrayList<Integer> salaries = new ArrayList<Integer>();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		ListofAllStaff.add(new Staff(eTitle.PROFESSOR));
		salaries.add(salary1);
		salaries.add(salary2);
		salaries.add(salary3);
		salaries.add(salary4);
		salaries.add(salary5);
		
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		ListofAllStaff = null;
		salaries = null;
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSalary() {
		assertTrue((salary1 + salary2 + salary3 + salary4 + salary5)/5 == (employee1.getSalary() + employee2.getSalary() + employee3.getSalary() + employee4.getSalary() + employee5.getSalary()));
		assertFalse((salary1 + salary2 + salary3 + salary4 + salary5)/5 != (employee1.getSalary() + employee2.getSalary() + employee3.getSalary() + employee4.getSalary() + employee5.getSalary()));
	}
	
	@Test(expected = PersonException.class)
	public void testPhoneNumber() throws PersonException {
		// this calls the PrintPhoneNumber() method in Person, passing through the invalid number to throw the exception
		Person.PrintPhoneNumber(invalid_phone_number);
	}
	/*
	 * Cannot get this test to work, I know its wrong, but can't tell where it is wrong
	@Test
	public void testDOB() throws PersonException {
		birthDate.setTime(Invalid_DOB);
		Person.PrintDOB(Invalid_DOB);
	}
	*/
}
