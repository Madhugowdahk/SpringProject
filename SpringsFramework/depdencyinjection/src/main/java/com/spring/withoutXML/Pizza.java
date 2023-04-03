package com.spring.withoutXML;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//name of bean is first pizza
@Component("firstPizza")
public class Pizza {
	@Value("pepper and salt")
	private String name;
	@Value("200")
	private int price;
	
	@Override
	public String toString() {
		return "Pizza [name=" + name + ", price=" + price + "]";
	}
	public Pizza(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public Pizza() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	void deliver()
{
	System.out.println("deliver the  pizza ontime bcz customers are very important");
}
}
