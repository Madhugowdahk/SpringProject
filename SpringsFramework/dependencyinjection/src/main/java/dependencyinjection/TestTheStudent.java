package dependencyinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTheStudent {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("dependencyinjection/springconfig.xml");
		Student s1=(Student)c.getBean("ab");
		Student s2=(Student)c.getBean("ba");
		System.out.println(s1);
		System.out.println(s2);

	}
}
