package com.multipleconstructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("project execution is started------");
		ClassPathXmlApplicationContext c= new ClassPathXmlApplicationContext("com/multipleconstructor/configspring.xml");
	Test a=c.getBean("test1",Test.class);
	a.add();
	System.out.println(a);
	
	System.out.println("project execution is ended-----");
	}

}
