package constructordepdencyinjectionreferencetype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c= new ClassPathXmlApplicationContext("constructordepdencyinjectionreferencetype/Newconfig.xml");
	Depe depe=c.getBean("refdepe",Depe.class);
	System.out.println(depe);
	Employe emp=c.getBean("refemp",Employe.class);
	System.out.println(emp);
	
	
	}

}
