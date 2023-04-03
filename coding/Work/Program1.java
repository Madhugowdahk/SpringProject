class Program1
{
    static int x=100;
    static void test()
    {
        System.out.println("running test function");
        int y=200;
        y=2;
        System.out.println("y value is"+y);
        System.out.println("x value accesed in test() is"+x);
    }
    public static void main(String[] args)
    {
        System.out.println("main function started");
        test();
        System.out.println("x value accesed in test() is" +x);
        System.out.println("main method ended");
    }
}