package com.example.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.basic.Address;
import com.example.basic.CustomerInfo;

public class DemoOne {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(
				ApplicationConfigOne.class);
 
		CustomerInfo customer = (CustomerInfo) context.getBean("cusInfo");
		customer.print();
 
		Address add = (Address) context.getBean("address");
		add.print();

	}

}
