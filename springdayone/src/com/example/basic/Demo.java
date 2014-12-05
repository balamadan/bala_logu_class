package com.example.basic;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Demo {
@SuppressWarnings("deprecation")
public static void main(String ar[]){
	try{
	ClassPathResource clResource=new ClassPathResource("basics.xml");
	System.out.println("======"+clResource.getURL());
	BeanFactory beanFactory=new XmlBeanFactory(clResource);
	//ApplicationContext applicationContext=new ClassPathXmlApplicationContext("basics.xml");
	AccountDetails aDetails=(AccountDetails) beanFactory.getBean("accountdetails");
	System.out.println("accdetails1"+aDetails);
	AccountDetails aDetails1=(AccountDetails) beanFactory.getBean("accountdetails");
	System.out.println("accdetails1"+aDetails1);
	//aDetails.print();
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}
}
