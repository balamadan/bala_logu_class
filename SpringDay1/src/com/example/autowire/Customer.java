package com.example.autowire;

	
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
	 
	public class Customer {
	 
		@Autowired
		@Qualifier("person1")
		private Person person;

		public Customer(){
			
		}

		public Person getPerson() {
			return person;
		}

		public void setPerson(Person person) {
			this.person = person;
		}
		
		
		
		
	}


