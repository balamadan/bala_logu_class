package cal;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Demo {

	public static void main(String args[]){
		ClassPathResource clResource=new ClassPathResource("springSetter.xml");
		BeanFactory bFactory=new XmlBeanFactory(clResource);
		CalInterfaceImpl calInterfaceImpl= (CalInterfaceImpl) bFactory.getBean("setterImpl");
		System.out.println("calculte value ===>"+calInterfaceImpl.calculate());
	}
}
