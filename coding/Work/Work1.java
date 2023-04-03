class Work1
{
    public static void main(String[] args)
    {
        int a=1996;
        if(a%4==0)
        {
            if(a%100==0)
            {
                if(a%400==0)
                    {
                        System.out.println("leap year");
                    }
                    else
                    {
                        System.out.println("not a leap year");
                    }
                    }
                    else
                    {
                        System.out.println("not a leap year");
                    }
                 }
                 else{
                    System.out.println("not a leap year");
                 }
    }
}