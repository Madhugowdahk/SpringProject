
import java.util.Scanner;
 class Power{
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter a number");
		int n=ip.nextInt();
		int pro=1;
		int rem=0;
		while(n!=0)
		{
			rem=n%10;
			pro=pro*rem;
			n=n/10;
		}
		System.out.println(pro);
		System.out.println("----------------------------------------");
		int c=0;
		for(int i=0;i<=pro;i++)
		{
			if(pro%i==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not a prime number");
		}
	}

}
