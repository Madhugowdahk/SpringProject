class BankAccount
{
    double total_amount=50000.00;
    void tocheckbalance()
    {
        System.out.println("total balance is "+total_amount);
    }
    void creditedamount(int n)
    {
        total_amount=total_amount+n;
         System.out.println("creditedamount is "+total_amount);   
    }
    void debitedamount(int n)
    {
        total_amount=total_amount-n;
         System.out.println("debited amount is "+total_amount);  
    }
    void withdraw(int n)
    {
        if(n<total_amount)
        {
            total_amount=total_amount-n;
             System.out.println("debited amount is "+total_amount);  
        }
        else
        {
             System.out.println("INSUFFICIENT FUND");  
        }
    }
    }
    
    class Bank
    {
        public static void main(String[] args){
            BankAccount ta1=new BankAccount();
             ta1.tocheckbalance();
             ta1.creditedamount(2000);
             ta1.debitedamount(5585);
             ta1.withdraw(15000);
        }
    }