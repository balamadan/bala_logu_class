package com.example.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.InitializingBean;

public class CustomerInfo //implements InitializingBean
{
	
	public String name;
	
	
	public CustomerInfo(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void print() {
		System.out.println("Print Customer Information");
		
	}
	
	/*@PostConstruct
	public void initCus(){
		System.out.println("customer infor init ... ");
	}
	@PreDestroy
	public void desCus(){
		System.out.println("customer info des .... ");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("customer info invasive .... ");
		
	}*/
	
	
	
	
	
	
	
	
	
	
	
	

}
