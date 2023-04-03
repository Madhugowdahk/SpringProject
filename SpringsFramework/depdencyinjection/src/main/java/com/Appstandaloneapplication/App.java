package com.Appstandaloneapplication;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
public static void main(String[] args) {
	ClassPathXmlApplicationContext c= new ClassPathXmlApplicationContext("com/Appstandaloneapplication/config.xml");
	Employe e=c.getBean("emp1",Employe.class);
	System.out.println(e.getName());
}
}
