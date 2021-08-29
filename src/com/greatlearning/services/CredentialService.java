package com.greatlearning.services;

import java.util.Random;

import com.greatlearning.models.Employee;

public class CredentialService {
	
	public String generateEmail(Employee employee, String department, String companyName) {
		return  employee.getFirstName().toLowerCase()+employee.getLastName().toLowerCase()+"."+department+"@"+companyName+".com";
	}

	public char[] generatePassword() {
		//Generate a random password which will contain (number, capital letter, small letter & special character)
	      String capitalCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCase = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "!@#$%^&*_=+-/";
	      String numbers = "1234567890";
	      String combinedChars = capitalCase + lowerCase + specialCharacters + numbers;
	      Random random = new Random();
	      char[] password = new char[8];
	      String [] chars = {capitalCase, lowerCase, specialCharacters, numbers };
	      StringBuilder sbString = new StringBuilder(8);
	      for(int i = 0; i< 2 ; i++) {
	    	  for(int j=0; j<4; j++) {
	    		  sbString.append(chars[j].charAt(random.nextInt(chars[j].length())));
	    	  }
	         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	      }
	      return password;
	}
	 public void showCredentials(Employee employee, String department, String companyName){
			
		 System.out.println("Dear, "+employee.getFirstName()+" your generated credentials are as follows");
			System.out.println("");
			System.out.println("Email --> "+generateEmail(employee, department, companyName));
			System.out.println();
			System.out.println("Password --> "+generatePassword());
		 
	 }
	 
	 public static boolean isNumber(String s)
	    {
	        for (int i = 0; i < s.length(); i++)
	            if (Character.isDigit(s.charAt(i)) == false)
	                return false;
	 
	        return true;
	    }
}
