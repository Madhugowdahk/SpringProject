class Man
{
    static int sum=0;
static int demo(int n)
{
	if(n>=1)
	{
		sum=sum+n;
		demo(n-1);
	
	}
    return sum;
    
}
public static void main(String[] args) {
	System.out.println(demo(10));
}
}
