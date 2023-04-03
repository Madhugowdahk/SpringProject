package logic;

import java.math.BigDecimal;
import java.util.Scanner;

public class Bigdecimal {
public static void main(String[] args) {
	Scanner ip=new  Scanner(System.in);
	BigDecimal a=ip.nextBigDecimal();
	BigDecimal b=ip.nextBigDecimal();
	System.out.println(a.add(b));
	System.out.println(a.multiply(b));
	
}
}
