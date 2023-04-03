class Demo5
{
     int p=10;
    void disp()
    {
    System.out.println("running disp() method");
    }
}

class MainClass4
{
    public static void main(String[] args)
    {
         System.out.println("main method started");
         System.out.println("p value is"+new Demo5().p);
         new Demo5().disp();
          System.out.println("main method ended");
    }
}