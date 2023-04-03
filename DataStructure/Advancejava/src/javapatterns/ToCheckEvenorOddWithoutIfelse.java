package javapatterns;

import java.util.Scanner;

public class ToCheckEvenorOddWithoutIfelse {
public static void main(String[] args) {
	Scanner ip=new Scanner(System.in);
	System.out.println("enter a number");
	int n=ip.nextInt();
	switch(n%2) {
	case 0:
		System.out.println("number is even");
	break;
	case 1:
		System.out.println("number is odd");
	}
}
}
