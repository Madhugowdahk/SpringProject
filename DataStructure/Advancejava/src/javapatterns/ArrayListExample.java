package javapatterns;
import java.util.ArrayList;
public class ArrayListExample {
public static void main(String[] args) {
	ArrayList<String>a=new ArrayList<>();
	a.add("c");
	a.add("c++");
	a.add("c#");
	a.add("j#");
	a.add("js");
	a.add("jsp");
	System.out.println("\nArrayList:");
	System.out.println(a);
	a.add(1, "phython");
	System.out.println("\narraylist after adding new item java:");
	System.out.println(a);
	System.out.println(a.size());
	a.remove("c#");
	System.out.println(a);
	int rem=1;
	System.out.println(9%10);
	}
}
