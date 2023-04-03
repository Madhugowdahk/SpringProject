package logic;

public class MergeSort {
	public static void conquer(int []a,int si,int mid,int ei)
	{
		int []merge=new int[ei-si+1];
		int index1=si;
		int index2=mid+1;
		int x=0;
		while(index1<=mid&&index2<=ei)
		{
			if(a[index1]<=a[index2])
			{
				merge[x++]=a[index1++];
			}
			else
			{
				merge[x++]=a[index2++];
			}
		}
		while(index1<=mid)
		{
			merge[x++]=a[index1++];
		}
		while(index2<=ei)
		{
			merge[x++]=a[index2++];
		}
		for(int i=0,j=si;i<merge.length;i++,j++)
		{
			a[j]=merge[i];
		}
		
	}

	public static void divide(int []a,int si,int ei)
	{
		//int mid=si+ei/2;//here problems occurs at when you are doing big project and related space and time complexity
	if(si<=ei)
	{
		return;
	}
		int mid=si+(ei-si)/2;
		divide(a,si,mid);
		divide(a,mid+1,ei);
		conquer(a,si,mid,ei);
	}
	public static void main(String[] args) {
		int []a= {6,3,9,5,2,8};
		int si=0;
		int ei=a[a.length-1];
		divide(a,si,ei);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}
