package com.cisc181.core;

import java.util.Date;
import com.cisc181.eNums.eTitle;

public class Staff extends Employee {

	 private Enum<eTitle> Title;

	   public Staff(Enum<eTitle> Title){
	        this.Title = Title;
	    }

	    public void setTitle(Enum<eTitle> Title){
	        this.Title = Title;
	    }
	    public Enum<eTitle> getTitle(){
	        return this.Title;
	    }

    

    
	public Staff(String FirstName, String MiddleName, String LastName,
			Date DOB, String Address, String Phone_number, String Email,
			String officeHours, int rank, double salary, Date hireDate,
			Enum<eTitle> Title) 
	
	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number,
				Email, officeHours, salary, hireDate);
		
		this.Title = Title;
	}

}