package com.example.basic;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.InitializingBean;


public class AccountDetails implements InitializingBean,BeanFactoryAware
{
	private CustomerInfo cusInfo= null;
	private Address add = null;
	private BeanFactory bFact;
	private String message=null;
	
	
	public AccountDetails(){
		System.out.println("Inside cons of Account details..");
	}
	public AccountDetails(CustomerInfo cusInfo,Address add){
		System.out.println("Inside arg cons of Account details..");
		this.cusInfo = cusInfo;
		this.add = add;
	}
	
	
	//Business ()
	public void print(){
		cusInfo.print();
		if(cusInfo.getName().equals("test")){
			add = (Address)bFact.getBean("address");
		}else{
			add = (ChildAddress)bFact.getBean("childaddress");
		}
		add.print();
	}
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		System.out.println("set message method called"+message);
		this.message = message;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		System.out.println("Inside the add "+add);
		this.add = add;
	}
	public CustomerInfo getCusInfo() {
		return cusInfo;
	}
	public void setCusInfo(CustomerInfo cusInfo) {
		System.out.println("Inside cus info ..");
		this.cusInfo = cusInfo;
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(" After properties set ()");
		
	}
	public void sta(){
		System.out.println("sta is called ...");
	}
	public void des(){
		System.out.println("des is called ...");
	}
	@Override
	public void setBeanFactory(BeanFactory bFact) throws BeansException {
		this.bFact = bFact;
		System.out.println("bena"+bFact);
	}
}


















