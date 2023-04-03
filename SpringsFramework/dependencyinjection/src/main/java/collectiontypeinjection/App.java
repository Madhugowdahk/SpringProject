package collectiontypeinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
public static void main(String[] args) {
	ClassPathXmlApplicationContext c= new ClassPathXmlApplicationContext("collectiontypeinjection/springconfig.xml");
	Employe e1=(Employe)c.getBean("emp");
	//c.getbeam("emp1",Employe.class)---you  can do this without upcasting
	System.out.println(e1);
}
}
