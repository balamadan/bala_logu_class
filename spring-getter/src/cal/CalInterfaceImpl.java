package cal;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;

public class CalInterfaceImpl implements CalInterface,InitializingBean,BeanNameAware {

	CalVarBean calBean;
	
	public CalVarBean getCalBean() {
		return calBean;
	}

	public void setCalBean(CalVarBean calBean) {
		this.calBean = calBean;
	}

	@Override
	public int calculate() {
		System.out.println("inside the calculate method");
		return calBean.a+calBean.b;
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("=================hi");
		
	}

	@Override
	public void setBeanName(String arg0) {
		
		
	}
	
	

}
