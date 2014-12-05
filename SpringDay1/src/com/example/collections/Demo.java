package com.example.collections;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Demo {
	public static void main(String[] args) {
		try{
		
			ClassPathResource resource = new ClassPathResource("collections.xml");
			BeanFactory factory = new XmlBeanFactory(resource);
			Customer cus = (Customer)factory.getBean("customer");
			System.out.println(cus.getLists());
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
