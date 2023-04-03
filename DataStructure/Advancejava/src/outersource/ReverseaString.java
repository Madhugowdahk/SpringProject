package outersource;
import java.util.Scanner;
public class ReverseaString {
	public static void reverse(String s)
	{
		String []a=s.split(" ");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]+"");
		}
	}
public static void main(String[] args) {
	
	Scanner ip=new Scanner(System.in);
	System.out.println("enter a sentence");
	String s=ip.nextLine();
	reverse(s);

}
}
