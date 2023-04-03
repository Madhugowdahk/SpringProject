 class Tickets {
	int no_of_tickets=100;
	void availableTickets()
	{
		System.out.println("total number of tickets is" +no_of_tickets);
	}
	void bookingTickets(int n)
	{
		System.out.println("booking tickets" +n+" tickets");

		if(n<no_of_tickets)
		{
			no_of_tickets=no_of_tickets-n;
			System.out.println("booking succes");
		}
		else
		{
			System.out.println("failed:insufficient tickets");
		}
	}
	void cancellingTickets(int n)
	{
		System.out.println("cancelling"+n+"tickets");
		no_of_tickets=no_of_tickets+n;
	}

}
class MainClass3
{
	public static void main(String[] args)
	{
		Tickets t=new Tickets();
		t.availableTickets();
		t.bookingTickets(20);
		t.availableTickets();
		t.cancellingTickets(10);
		t.availableTickets();

	}	 
}

