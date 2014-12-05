package com.example.constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Demo {
	public static void main(String[] args) {
		try{
		
			ClassPathResource resource = new ClassPathResource("constructor.xml");
			BeanFactory factory = new XmlBeanFactory(resource);
			Order order= (Order)factory.getBean("order");
			System.out.println(order);
		//	OrderFactory order= (OrderFactory)factory.getBean("orderFact");
		//	System.out.println(order);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
