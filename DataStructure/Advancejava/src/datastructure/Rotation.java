package datastructure;

public class Rotation {
	static void leftRotate(int arr[], int d)
	{
int k = 0,g = 0;
		if (d == 0) {
			return;
		}
		int n = arr.length;
		int []s=new int[arr.length];
		int c=0;
		int j=0;
		int []first=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
		 if (d == arr[i]) {
			 c++;
			 j=i;
			 break;
			 }
		 
		 }
		if(c==1)
		{
			 k=0;
			 g=j+1;
			int l=0;
			for(int i=g;i<arr.length;i++)
			{
				s[k]=arr[g];
				k++;
				g++;
				l=i;
			}
			
		}
		System.out.println(k);
			for(int i=0;i<arr.length;i++)
			{
				s[k]=arr[i];
				if(i==g-1)
				{
					break;
				}
			}
		
	for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
	}
	}

	
	public static void main(String[] args)
	{
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int n = arr.length;
		int d = 2;

		leftRotate(arr, d); 
		
	}

}
