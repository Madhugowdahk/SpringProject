package outersource;
import java.util.Scanner;
public class PracticeonString {
public static void main(String[] args) {
	Scanner ip=new Scanner(System.in);
	System.out.println("enter a string");
	String a=ip.nextLine();
	StringBuilder s=new StringBuilder(a);
	System.out.println(a);
	for(int i=0;i<a.length();i++)
	{
		if(i==3) {
		
	s.deleteCharAt(i);
		
	}
	}
	System.out.println(s);
}
}
