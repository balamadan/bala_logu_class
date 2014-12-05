package autowire;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Demo {

	public static void main(String args[]){
		ClassPathResource clp=new ClassPathResource("autowire.xml");
		BeanFactory bf=new XmlBeanFactory(clp);
		Bala b=(Bala) bf.getBean("bala");
		b.print();
		System.out.println("===============");
	}
}
