package outersource;
import java.util.Scanner;
public class RemoveTheRepeatedwords {
	public static void remove(String s)
	{
		
		String []a=s.split(" ");
		String []b=s.split(" ");
		
		for(int i=0;i<a.length;i++)
		{
			
			int c=0;
			for(int j=0;j<b.length;j++)
			{
				if(a[i].equals(b[j]))
				{
					b[j]="\0";
					c++;
					}
			}
			if(c>1)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
		public static void main(String[] args) {
	Scanner ip=new Scanner(System.in);
	System.out.println("enter a sentencee");
	String s=ip.nextLine();
	remove(s);
}
}
