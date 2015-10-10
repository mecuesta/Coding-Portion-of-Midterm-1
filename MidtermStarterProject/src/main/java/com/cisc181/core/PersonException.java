package com.cisc181.core;

import com.cisc181.core.Person;

public class PersonException extends Exception {
	
	private Person Person;
	
	private PersonException() {
	}
	public Person getPerson() {
		return this.Person;
	}
	public void setPerson(Person Person) {
		this.Person = Person;
	}

	public static void main(String[] args) {
		//// RIGHT HERE I AM AT GETTING THIS TO THROW EXCEPTIONS YIPPEE

	}

}
