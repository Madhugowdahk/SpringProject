
class Sum {
	static boolean sumofprime(int n) {
		int c=0;
		for(int i=0;i<=n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			return true;
		}
		else
		{
			return false;
		}
		}
	public static void main(String[] args) {
		int sum=0;
		int []arr= {10,20,30,40,50};
		for(int i=0;i<=arr.length;i++)
		{
			boolean ans=Sumofprime(arr[i]);
			if(ans==true) {
				sum=sum+arr[i];
			}
		}
		System.out.println(sum);
}
}
