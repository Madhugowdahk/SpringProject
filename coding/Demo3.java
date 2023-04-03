class Demo3
{
    static int x=10;
    static int y=20;
}
class Demo4
{
    static void test()
    {
         System.out.println("running test() method");
          System.out.println("static variable x value of demo3 class is "+Demo3.x);
           System.out.println("static variable y value of demo3 class is "+Demo3.y);
    }
}
class MainClass3
{
    public static void main(String[] args)
    {
         System.out.println("main method started");
         Demo4.test();
          System.out.println("main method ended");
    }
}