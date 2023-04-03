package javapatterns;

import java.util.Scanner;

public class SwitchCase {
public static void main(String[] args) {
	Scanner ip=new Scanner(System.in);
	System.out.println("enter any number from 1 to 5");
	int i=ip.nextInt();
	switch(i) {
	case 1:{
		System.out.println("you entered one");
		break;
	}
	case 2:{
		System.out.println("you entered two");
		break;}
	case 3:{
		System.out.println("three");
		break;}
	case 4:{
		System.out.println(4);
		break;}
	case 5:{
		System.out.println(5);
		break;}
		default:{
		System.out.println("you are not entered any number");
}

}}
}
