package com.greatlearning.main;

import java.util.Scanner;
import com.greatlearning.models.Employee;
import com.greatlearning.services.CredentialService;
 
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		CredentialService cs = new CredentialService();
		Scanner sc = new Scanner(System.in);
		String department = null;
		String firstName;
		String lastName;
		String companyName;
		boolean text;
		System.out.println("Please enter your company name");
		companyName = sc.next();
		System.out.println("Welcome to "+companyName);
		System.out.println("Please enter your first name");
		firstName = sc.next();
		System.out.println("Please enter your Last name");
		lastName = sc.next();
		System.out.println("Enter your department from following\n"+"1. Techinal\n"+"2. Admin\n"+"3. HR\n"+"4. Legal\n");
		Employee  employee = new Employee(firstName, lastName);
		int option = 0;
		try {
			option = sc.nextInt();
		}catch(Exception e)  
        {  
            // resolving the exception in catch block  
           System.out.println("Please enter an number");  
           return;
       }  
		
		if(option < 5) {
			switch(option) {
			case 1:
				department="tech";
				break;
			case 2:
				department="admin";	
				break;
			case 3:
				department="hr";
				break;
			case 4:
				department="legal";
				break;
			default:
				System.out.println("Enter a valid options.");
				break;
		}
			cs.showCredentials(employee,department, companyName);
	}
		else {
			System.out.println("Enter a valid options.");
		}
	}
}
