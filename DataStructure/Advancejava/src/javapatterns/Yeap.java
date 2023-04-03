package javapatterns;

public class Yeap {
public static void main(String[] args) {
	SingleTon s=SingleTon.getinstanceof();
	System.out.println(s.id+" "+s.m);
	
}
}
