class Online
{
    int total_mumber_of_tickets=200;
    void availabletickets(){
    System.out.println("available tickets is "+total_mumber_of_tickets);
}
    void bookingtickets(int n){
    System.out.println("booking "+n +"tickets");
    if(n<total_mumber_of_tickets){
    total_mumber_of_tickets=total_mumber_of_tickets-n;
    System.out.println("booking success");
    }
    else
    {
        System.out.println("failed:insufficient tickets"); 
    }
}
    void cancellingtickets(int n){
     System.out.println("cancelling "+n+ "tickets");
      total_mumber_of_tickets=total_mumber_of_tickets+n;
}
}
class mainclass7
{
    public static void main(String[] args){
      Online  o1=new Online();
        o1.availabletickets();
        o1.bookingtickets(250);
        o1.cancellingtickets(25);
        o1.availabletickets();
    }
}