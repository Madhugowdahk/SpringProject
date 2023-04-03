package com.multipleconstructor;

public class Test {


	private int x;
	private int y;
	public Test(int x,int y)
	{
		this.x=x;
		this.y=y;
		System.out.println("constructor:int-int");
	}
	public Test(double x,double y)
	{
		this.x=(int)x;
		this.y=(int)y;
		System.out.println("constructor:double-double");
	}
	public void add()
	{
		System.out.println("value of x is:"+x);
		System.out.println("value of y is:"+y);
		System.out.println("result is:"+(this.x+this.y));
	}
	@Override
	public String toString() {
		return "Test [x=" + x + ", y=" + y + "]";
	}
}
