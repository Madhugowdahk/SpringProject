package datastructure;

import java.util.Arrays;

public class ReplaceANumberToEvenPosition {
	
	public static void rev(int []a,int n)
	{
		
		
		int []ans=new int [n];
		
		
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				if(a[i]%2==0) {
				ans[i]=a[i];
			}}
			else
			{
				if(a[i]%2!=0) {
				ans[i]=a[i];
			}
			}
		}
		for(int s:ans)
		{
			System.out.println(s+" ");
		}
	}
public static void main(String[] args) {
	int []a= {0,1,3,2,5,4};
	rev(a,a.length);
}
}
