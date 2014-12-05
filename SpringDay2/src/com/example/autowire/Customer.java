package com.example.autowire;

	
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
	@Component
	public class Customer {
	 
		@Autowired
		@Qualifier("person2")
		Person person;

		public Customer(){
			
		}

		public Person getPerson() {
			return person;
		}

		public void setPerson(Person person) {
			this.person = person;
		}
		
		
		
		
	}


