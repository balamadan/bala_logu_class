package com.example.autowire;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Demo {
	public static void main(String[] args) {
		try{
		
			ClassPathResource resource = new ClassPathResource("autowire.xml");
			BeanFactory factory = new XmlBeanFactory(resource);
			Employee emp = (Employee)factory.getBean("employee");
			A a = (A)factory.getBean("a");
			Developer dev = (Developer)factory.getBean("developer");
			Customer cust = (Customer)factory.getBean("customer");
			System.out.println(cust.getPerson().getName());
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
