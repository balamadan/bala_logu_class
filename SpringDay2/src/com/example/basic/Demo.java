package com.example.basic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {
		try{
		
			ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("basic.xml");
			
		/*	ClassPathResource resource = new ClassPathResource("basic.xml");
			BeanFactory factory = new XmlBeanFactory(resource);
			PostProcess pp = new PostProcess();*/
		//	((XmlBeanFactory)factory).addBeanPostProcessor(pp);
			AccountDetails accDetails = (AccountDetails)app.getBean("accountdetails");
			app.close();
			//((XmlBeanFactory)factory).destroySingletons();
			/*accDetails.print();
			System.out.println(accDetails);
			accDetails = (AccountDetails)factory.getBean("accountdetails");
			System.out.println(accDetails);
			*/
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
