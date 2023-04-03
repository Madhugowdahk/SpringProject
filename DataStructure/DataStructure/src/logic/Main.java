package logic;

public class Main {

		  public static void main(String args[]) {
		    int number = 23546755;
		    int firstDigit = 0;
		    int lastDigit = 0;

		    // To find the last digit of the number : taking modulo with 10
		    lastDigit = (number % 10);

		    // To find the first digit of the number
		    while (number != 0) {
		      firstDigit = Math.abs(number % 10);
		      number /= 10;
		    }
		      
		    System.out.println("The First digit of the given number is: " + firstDigit);
		    System.out.println("The Last digit of the given number is: " + lastDigit);
		    System.out.println( firstDigit+ lastDigit);
		  }
		}


