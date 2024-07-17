public class Event001 
{
    public Event001() 
	{
        System.out.println("Displaying Event Details");
    }

    public String eventID;
    public String eventName;
    public String eventType;
    public String organizer;
    public String location;
    public String date;
    public String time;
    public int durationMinutes;
    public int totalTickets;
    public int availableTickets;
    public double ticketPrice;
    public boolean isIndoor;
    public String contactNumber;
    public String website;

    public static int totalEvents = 1000;
    public static double averageTicketPrice = 75;
    public static int totalTicketsOverall = 50000;
    public static int totalAvailableTickets = 15000;
    public static int totalIndoorEvents = 600;
    public static int totalOutdoorEvents = 400;
    public static String mostPopularEvent = "Event Example";
    public static String mostPopularLocation = "Los Angeles";
    public static double totalRevenue = 3750000.0;
    public static double highestTicketPrice = 500;
    public static double lowestTicketPrice = 10;
}


