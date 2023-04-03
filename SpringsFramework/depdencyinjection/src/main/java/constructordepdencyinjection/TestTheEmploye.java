package constructordepdencyinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTheEmploye {
public static void main(String[] args) {
	ClassPathXmlApplicationContext c= new ClassPathXmlApplicationContext("constructordepdencyinjection/config1.xml");
	Employe e=c.getBean("xxx",Employe.class);
	System.out.println(e);
}
}
