package SpringExpression;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spell {
public static void main(String[] args) {
	ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("SpringExpression/Newconfig.xml");
    SpellExp s=c.getBean("bean1",SpellExp.class);
    System.out.println(s);


}
}
