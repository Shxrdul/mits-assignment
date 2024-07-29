package com.mits.assignment.models;

public class Employee5 implements Comparable<Employee5> {
	
	// Employee POJO custom sorting based on firstname only
	
	private String id;
	private String firstName;
	private String lastName;
	
	public Employee5(String id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return "Employee5 [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	@Override
	public int compareTo(Employee5 obj) {
		return this.firstName.compareTo(obj.firstName);
	}

}
