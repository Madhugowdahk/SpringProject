package logic;

public class InsertionSort {
public static void main(String[] args) {
	int []a= {5,4,3,2,1};
	int j;
	for(int i=1;i<a.length;i++)
	{
		int temp=a[i];
		j=i-1;
		while(j>=0&&temp<a[j])
		{
			a[j+1]=a[j];
			j--;
		}
		a[j+1]=temp;
	}

	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]+" ");
	}
}
}
