package com.valueasattribute;

public class Car {
	
	private String brand;
	private int cost;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", cost=" + cost + "]";
	}
	
	
	
}
