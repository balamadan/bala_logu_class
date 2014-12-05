package com.example.javaannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnnoService {

	 	@Autowired
		CustomerDAO customerDAO;
	 
		@Override
		public String toString() {
			return "AnnoService [customerDAO=" + customerDAO + "]";
		}
	}

