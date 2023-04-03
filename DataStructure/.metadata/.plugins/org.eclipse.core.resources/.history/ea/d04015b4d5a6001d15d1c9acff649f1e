package javapatterns;

public class TrimorphicNumbers {
	public static boolean trim(int n)
	{
		boolean flag=true;
	   int cube=n*n*n;
	   while(n!=0)
	   {
		   if(n%10!=cube%10)
		   {
			   flag=false;
			   break;
		   }
		   cube=cube/10;
		    n=n/10;
		 
	   }
	   return flag;
	   
	   
	}
public static void main(String[] args) {

	for(int i=1;i<=100;i++)
	{
		if(trim(i))
		{
			System.out.println(i);
		}
	}
	
}
}
