package com.example.javaannotation;

import org.springframework.stereotype.Component;

@Component("sss")
public class CustomerDAO {

	
		@Override
		public String toString() {
			return "Hello , This is CustomerDAO";
		}	
	}

