public class Had {
    public static void main(String[] args) {
        int n=5196;
        int n1=n;
        int c=0;
        while(n1!=0)
        {
            n1=n1/10;
            c++;
        }
        int []a=new int[c];
        int rem=0,k=0;
        while(n!=0)
        {
            rem=n%10;
a[k]=rem;
k++;
n=n/10;
        }
        for(int i=0;i<=a.length-1;i++)
        {
            for(int j=i+1;j<=a.length-1;j++)
            {
                if(a[i]<a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=a[i];
                }
            }
        }
        int ans=0;
        for(int i=0;i<a.length;i++)
        {
            ans=(ans*10)+a[i];
        }
        System.out.println(ans);
    }
}
