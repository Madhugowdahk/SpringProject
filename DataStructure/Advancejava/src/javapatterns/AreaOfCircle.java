package javapatterns;

import java.util.Scanner;

public class AreaOfCircle {
public static void main(String[] args) {
	int radius;
	 double  area;
	Scanner ip=new Scanner(System.in);
	System.out.println("enter the radius of the circle");
	radius=ip.nextInt();
	area=(double)(3.14*radius*radius);
	System.out.println("area of the circle"+area);
}
}