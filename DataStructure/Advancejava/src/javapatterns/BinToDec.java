package javapatterns;
import java.util.*;
public class BinToDec {
public static void main(String[] args) {
	String bstr;
	int decnum ;
	System.out.println("enter binary String(0-1)");
	bstr=new Scanner(System.in).nextLine();
	 int decNum=bin2dec(bstr);
	if(decNum==-1)
	{
		System.out.println("invalid string");
	}
	else
	{
		System.out.println("decimal number :"+decNum);
	}
}
public static int bin2dec(String binaryString)
{
	int dnum=0;
	int i=0;
	int n;
	int len=binaryString.length();
	while(i<len)
	{
		n=binaryString.charAt(i)-48;
		if(n!=0&&n!=1)
		{
			return -1;
		}
		dnum=(dnum*2)+n;
		i++;
	}
	return (dnum);
}
}
