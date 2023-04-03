package valueascschema;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MusicSolution {
public static void main(String[] args) {
	ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("valueascschema/configuring.xml");
	Music m=(Music) c.getBean("man");
	System.out.println(m);
}
}
