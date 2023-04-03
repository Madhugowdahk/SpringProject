package datastructure;

public class FindThreeMaxElementsInTheArray {
	public static void find(int []a,int size)
	
	{
		int first,second,third;
		
		if(a.length<size)
		{
			System.out.println("invalid input");
		}
		third = first = second = a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>first)
			{
				third=second;
				second=first;
				first=a[i];
			}
			else if(a[i]>second)
			{
				third=second;
				second=a[i];
			}
			else if(a[i]>third)
				
			{
				third=a[i];
			}
		}
		System.out.println(first+" "+second+" "+third);
		
		
		
	}
public static void main(String[] args) {
	int []a= {1,2,3,4,5,6};
	find(a,a.length);
}
}
