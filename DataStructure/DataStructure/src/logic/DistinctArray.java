package logic;

public class DistinctArray {
	
	public static void distinct(int []z,int n)
	{
		for(int i=0;i<z.length;i++)
		{
			int c=0;
			int j;
			for(j=0;j<i;j++)
			{
				if(z[i]==z[j])
				{
					break;
				}
			}
			if(i==j)
			{
				System.out.println(z[i]+" ");
			}
		}
		
		
	}
public static void main(String[] args) {
	int []z= {1,1,2,3,4,2,5,6,6,7,8};
	distinct(z,z.length);
}
}
