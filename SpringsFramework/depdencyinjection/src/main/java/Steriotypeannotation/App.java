package Steriotypeannotation;


	import org.springframework.context.support.ClassPathXmlApplicationContext;



	public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c= new ClassPathXmlApplicationContext("Steriotypeannotation/stertotypeconfig.xml");
	Ipl a=c.getBean("ipl" ,Ipl.class);
	System.out.println(a);
	}
	}

