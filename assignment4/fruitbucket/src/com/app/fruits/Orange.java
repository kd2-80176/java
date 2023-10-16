package com.app.fruits;

public class Orange extends Fruit{

	
	
	
	public Orange() {
		super();
		setName("ORANGE");
	}

	public Orange(String color, double weight, String name) {
		super(color, weight, name);
		
	}

	@Override
	public void accept() {
		System.out.println("******ENTER THE DETAILS OF ORANGE******");
		super.accept();
	}

	
	@Override
	public String toString() {
		
		return super.toString();
	}

	@Override
	public String taste() {
		
		return "Sweet";
	}
	

}
