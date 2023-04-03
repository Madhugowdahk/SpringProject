package datastructure;

public class ArrayReverse {
	
	public static void reverse(int []a)
	{
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
		
	}
public static void main(String[] args) {
	
int []a= {1,2,3,4,5,6,7,8,9};
reverse(a);
}
}