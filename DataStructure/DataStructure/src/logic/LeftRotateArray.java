package logic;

public class LeftRotateArray {
	
	public static void rotate(int []a,int d,int n)
	{
		int []temp=new int [n];
		int k=0;
		int c=0;
		

		for(int i=d;i<a.length;i++)
		{
			temp[k]=a[i];
			k++;
		}
		
		for(int i=0;i<d;i++)
		{
			temp[k]=a[i];
			k++;
		}
		for(int s:temp)
		{
			System.out.print(s+" ");
		}
		}
public static void main(String[] args) {
	int []a= {1,2,3,4,5,6,7,8,9};
	int d=3;
	rotate(a,d,a.length);
	}
}

//0p-4,5,6,7,8,9,1,2,3-left rotate
//op-2,1,9,8,7,6,5,4,3-right rotate

