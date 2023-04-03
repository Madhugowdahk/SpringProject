public class DEC {
    public static void main(String[] args) {
      int n=13;
      int rem=0;
      String s="";
      while(n!=0)
      {
        rem=n%2;
        s=rem+s;
        n=n/2;
      }  
      System.out.println(s);
    }

}
