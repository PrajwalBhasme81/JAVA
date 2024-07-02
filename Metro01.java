public class Metro01
{
	public static void displayTicketPrice(String from,String to)
	{
		if(from  == "Banashankari" && to == "BTM")
		{
			System.out.println("The Ticket Price is : 25Rs");
		}
		else
		{
			System.out.println("The Ticket Price is : 50Rs");
		}
	}
	
	public static void checkCardBalance(double cardBalance, double ticketPrice) 
	{
        if (cardBalance >= ticketPrice) 
		{
            System.out.println("The card balance after purchasing the ticket is: " + (cardBalance - ticketPrice) + "Rs");
        } 
		else 
		{
            System.out.println("Insufficient balance. Please recharge your card.");
        }
		System.out.println("The Ticket Price is :"+ticketPrice);
    }

}