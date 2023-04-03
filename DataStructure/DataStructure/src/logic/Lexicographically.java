package logic;


import java.util.Arrays;

public class Lexicographically {
public static void main(String[] args) {
	String s="this world is full of ops  AA";
	String []spilt=s.split(" ");
	Arrays.sort(spilt);
	for(String s1:spilt)
	{
		System.out.println(s1);
	}
	System.out.println("______________________");
	//without predefined method
	String str=" sentence";
	char []a=str.toCharArray();
	char temp;
	for(int i=1;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	for(char s1:a)
	{
		System.out.print(s1+" ");
	}
	
	
}
}
