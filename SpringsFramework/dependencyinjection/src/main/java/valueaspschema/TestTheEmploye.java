package valueaspschema;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTheEmploye {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("valueaspschema/springconfiguration.xml");
	Employe e1=(Employe) c.getBean("xxx");
	Employe e2=(Employe) c.getBean("xyx");
	System.out.println(e1);
	System.out.println(e2);
	
	
	}
}
