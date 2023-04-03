package com.spring.withoutXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
	public static void main(String[] args) {
		//here you have to be genius things will change(	ApplicationContext c=new AnnotationConfigApplicationContext(); this we have to use here)
		ApplicationContext c=new AnnotationConfigApplicationContext(PizzaConfiguration.class);
		Pizza p=c.getBean("firstPizza",Pizza.class);
		System.out.println(p);
		p.deliver();
	}

}
