package constructordependencyinject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
public static void main(String[] args) {
	System.out.println("project execution started");
	ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("/constructordependencyinject/springconfig.xml");;
  Student s=c.getBean("xxx",Student.class);
  System.out.println(s);


}
}
