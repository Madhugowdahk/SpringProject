package com.multipleconstructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
	public static void main(String[] args) {
		System.out.println("project execution is started------");
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("com/multipleconstructor/NewFile.xml");
	Test1 n=context.getBean("test",Test1.class);
	n.add();
	System.out.println(n);
	
	System.out.println("project execution is ended-----");
	}

}


