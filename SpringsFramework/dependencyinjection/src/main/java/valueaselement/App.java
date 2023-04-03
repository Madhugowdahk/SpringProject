package valueaselement;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
public static void main(String[] args) {
	ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("valueaselement/confignewprocess.xml");
	Student s=(Student)c.getBean("student1");
	Student s1=(Student)c.getBean("student11");
	System.out.println(s);
	System.out.println(s1);
	
	
}
}
