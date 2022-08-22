package com.laptop.model;


public class Laptop {

    private	String name;
	private String type;
    private	int laptopId;
	private double price;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public Laptop(String name, String type, int laptopId, double price) {
		super();
		this.name = name;
		this.type = type;
		this.laptopId = laptopId;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [name=" + name + ", type=" + type + ", laptopId=" + laptopId + ", price=" + price + "]";
	}
	
	
}
