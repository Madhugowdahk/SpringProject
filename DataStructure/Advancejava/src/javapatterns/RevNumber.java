package javapatterns;

import java.util.Scanner;

public class RevNumber {
public static void main(String[] args) {
	Scanner ip=new Scanner(System.in);
	int n=ip.nextInt();
	int rev=0;
	int rem;
	while(n>0)
	{
		rem=n%10;
		rev=(rev*10)+rem;
		n=n/10;
	}
	System.out.println(rev);
}
}
