package logic;

import java.util.Scanner;

public class Print {
public static void main(String[] args) {
	Scanner ip=new Scanner(System.in);
	System.out.println("enter a string");
	String s1=ip.nextLine();
	String s=s1.toLowerCase();
	int c=0;
	for(int i=0;i<s.length();i++) {
		char n=s.charAt(i);
	
	if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u')
	{
		c++;
	}
	}
	System.out.println("number of vowels present in an array:"+c);
}
}
