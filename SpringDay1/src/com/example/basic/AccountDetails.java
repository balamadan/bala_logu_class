package com.example.basic;



public class AccountDetails
{
	private CustomerInfo cusInfo= null;
	private Address add = null;
	
	
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
		add.print();
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

}


















