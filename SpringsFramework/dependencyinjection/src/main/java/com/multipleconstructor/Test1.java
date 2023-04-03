package com.multipleconstructor;
//by default it will follow top to bottom,but always string type will be exceuted first
//we can solve abmiguity problem by specifying type of an value
public class Test1 {
	private int x;
	 private int y;
	 public Test1(double x,double y)
	 {
		 this.x=(int)x;
		 this.y=(int)y;
		 System.out.println("constructor:double-double");
	 }
	 public Test1(int x,int y)
	 {
		 this.x=x;
		 this.y=y;
		 System.out.println("constructor:int-int");
	 }
	 
	 public Test1(String x,String y)
	 {
		 
		 this.x=Integer.parseInt(x);
		 this.y=Integer.parseInt(y);
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


