package com.mits.assignment.models;

import java.util.Objects;

public class Employee2 {

	// Employee POJO implementing only the hashcode method
	
		private String id;
		private String firstName;
		private String lastName;
		
		public Employee2(String id, String firstName, String lastName) {
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
		public int hashCode() {
			return Objects.hash(firstName, id, lastName);
		}
	
}
