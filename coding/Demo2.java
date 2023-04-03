class Demo2
{
    static int x=100;
    final static int y=300;
    static void test()
    {
        System.out.println("running test() method");
    }
}
class MainClass2
{
    public static void main(String[] args)
    {
        System.out.println("main method started");
        System.out.println("static variable x value of demo2 class is"+Demo2.x);
        System.out.println("static variable x value of demo2 class is"+Demo2.x);
        System.out.println("modifying static variable x value");
        Demo2.x=200;
         System.out.println("static variable x value of demo2 class is"+Demo2.x);
        System.out.println("static variable x value of demo2 class is"+Demo2.y);
System.out.println("main method ended");
    }
}