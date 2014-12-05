package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DemoAspect {

	public static void main(String args[]){
		ApplicationContext appContext = new ClassPathXmlApplicationContext("aspect.xml");

		AspectImplement aspectImplement = (AspectImplement) appContext.getBean("aspectImplement");
		aspectImplement.print();

	}
}
