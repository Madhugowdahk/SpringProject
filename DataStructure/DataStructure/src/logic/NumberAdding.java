package logic;

import java.util.Scanner;

public class NumberAdding {
public static void main(String[] args) {
	Scanner ip=new Scanner(System.in);
	System.out.println("enter a number");
	int n=ip.nextInt();
	int rem=0;
	int sum=0;
	while(n!=0)
	{
		rem=n%10;
		sum=sum+rem;
		n=n/10;
		
	}
	System.out.println("sum of the number is :"+sum);
}
}
