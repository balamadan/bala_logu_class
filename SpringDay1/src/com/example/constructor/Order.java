package com.example.constructor;

public class Order {
	
		private String name;
		private String address;
		private int id;
	 
		public Order(String name, String address, int age) {
			this.name = name;
			this.address = address;
			this.id = age;
		}
	 
		public Order(String name, int age, String address) {
			this.name = name;
			this.id = age;
			this.address = address;
		}
		
		public String toString(){
			return " name : " +name + "\n address : "
	               + address + "\n age : " + id;
		}
	 
	}


