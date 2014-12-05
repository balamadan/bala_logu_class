package com.example.basic;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Demo {
	public static void main(String[] args) {
		try{
		
			ClassPathResource resource = new ClassPathResource("basic.xml");
			System.out.println("======"+resource.getURL());
			BeanFactory factory = new XmlBeanFactory(resource);
			AccountDetails accDetails = (AccountDetails)factory.getBean("accountdetails");
			accDetails.print();
		//	System.out.println(accDetails);
		//	accDetails = (AccountDetails)factory.getBean("accountdetails");
			//System.out.println(accDetails);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
