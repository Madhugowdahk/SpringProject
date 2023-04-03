class Demo6
{
    static int n=100;
    int m=200;
    static void test(){
        System.out.println("running test() method");
    }
    void disp()
    {
        System.out.println("running disp() method");
    }
}
class MainClass5
{
    public static void main(String[] args){
        System.out.println("main method started");
        System.out.println("n value is"+demo6.n);
        Demo6.n test();
        System.out.println("m value is"+new Demo6().m);
        new Demo6().m disp();
        System.out.println("main method ended");
    }
}