package com.cisc181.core;

import java.io.*;
import java.util.Date;

import com.cisc181.core.Person;

public class PersonException extends Exception {
	
	private Person Person;
	
	public PersonException(String phone_number) {
		this.Person = Person;
	}
	public PersonException(Date DOB) {
		this.Person = Person;
	}
	public Person getPerson() {
		return Person;
	}

	public static void main(String[] args) {
		

	}

}
