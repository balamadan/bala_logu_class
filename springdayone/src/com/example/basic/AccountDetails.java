package com.example.basic;

public class AccountDetails {

	private CustomerInfo cusInfo= null;
	private Address add = null;
	
	public AccountDetails(){
		System.out.println("Inside cons of Account details..");		
	}
	public AccountDetails(CustomerInfo cInfo,Address add){
		System.out.println("Inside argument cons of Account details..");	
		this.add=add;
		cusInfo=cInfo;
	}
	
	//Business ()
	public void print(){
		cusInfo.print();
		add.print();
	}
	public CustomerInfo getCusInfo() {
		return cusInfo;
	}
	public void setCusInfo(CustomerInfo cusInfo) {
		System.out.println("inside the cusinfo");
		this.cusInfo = cusInfo;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		System.out.println("inside the address");
		this.add = add;
	}
	
	
	
}
