package javapatterns;

public class SingleTon {
private static SingleTon s;
int id=10;
String m="man";
public SingleTon() {
	System.out.println("one object per class");// TODO Auto-generated constructor stub
}
public static SingleTon getinstanceof ()
{
	if(s==null)
	{
		s=new SingleTon();
	}
	return s;
}
}
