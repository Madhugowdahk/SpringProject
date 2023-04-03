package outersource;
import java.util.ArrayList;
import java.util.Scanner;
public class Practice {
public static void main(String[] args) {
	
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a string");
    String s=sc.nextLine();
	int numElements = Integer.parseInt(s);
	ArrayList<Integer> numList = new ArrayList<>();
	for(int i = 0;i < numElements;i++){
		numList.add(sc.nextInt());
	     }
	for(Integer num:numList)
	{
		System.out.println(num+" ");
	}
}
}
