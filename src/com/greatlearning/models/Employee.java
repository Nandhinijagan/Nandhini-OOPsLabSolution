package com.greatlearning.models;

public class Employee {

private	String firstName;

private String lastName;

private String deparment;
private String email;
private String password;

public Employee(String firstName, String lastName) {
	super();
	this.firstName = firstName;
	this.lastName =lastName;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	lastName = lastName;
}
}
