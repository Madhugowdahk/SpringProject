package com.valueasattribute;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Solution {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext c = 
				new ClassPathXmlApplicationContext("com/valueasattribute/springconfig.xml");
		
		Car car = (Car) c.getBean("ab");
		Car car1 = (Car) c.getBean("ba");
		System.out.println(car);
		System.out.println(car1);
	}

}
