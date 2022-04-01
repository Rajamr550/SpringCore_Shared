package com.zensar;

public class Item {
	private String name;
	private double price;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Inside default Item ");
	}
	public Item(String name, double price) {
		super();
		this.name = name;
		this.price = price;
		System.out.println("Inside Parametrized Item ");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("Inside setName Item ");
		
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + "]";
	}
	
	
}
