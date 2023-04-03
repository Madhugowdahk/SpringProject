package logic;
import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class Regex {
public static void main(String[] args) {
	System.out.println("enter a long number");
	Scanner ip=new Scanner(System.in);
	BigInteger a=ip.nextBigInteger();
	System.out.println(a);
	System.out.println("enter the value of b");
	BigInteger b=ip.nextBigInteger();
	System.out.println(b);
	//in case of biginteger class + and * or - operators cant be used we need to use predefined methods such as add,multiply etc
	System.out.println("the op is:"+a.add(b));
	System.out.println(a.multiply(b));
}
}
