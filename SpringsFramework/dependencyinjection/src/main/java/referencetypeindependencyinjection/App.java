package referencetypeindependencyinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
public static void main(String[] args) {
	ClassPathXmlApplicationContext c= new ClassPathXmlApplicationContext("referencetypeindependencyinjection/configspring.xml");
	B b=c.getBean("xxx",B.class);
	System.out.println(b);
	A a=c.getBean("yyy",A.class);
	System.out.println(a);
}
}
