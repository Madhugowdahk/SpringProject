package javapatterns;

public class ConstructorChaining {
	public ConstructorChaining() {
		System.out.println("default construcot called");
	}
	ConstructorChaining(String s)
	{
		this();
		System.out.println("one parameter with "+s);
	}
	ConstructorChaining(String s,int i)
	{
		this("hey");
		System.out.println("two parameters"+s+" "+i);
	}
public static void main(String[] args) {
	ConstructorChaining c=new ConstructorChaining("man",100);
}
}
