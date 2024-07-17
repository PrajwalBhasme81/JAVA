public class Concert 
{
    public Concert() 
	{
        System.out.println("Displaying Concert Details");
    }

    public String concertID;
    public String artist;
    public String genre;
    public String venue;
    public String city;
    public String country;
    public String date;
    public String time;
    public int durationMinutes;
    public double ticketPrice;
    public int totalTickets;
    public int availableTickets;
    public boolean isOutdoor;
    public String organizer;
    public String contactNumber;

    public static int totalConcerts = 500;
    public static double averageTicketPrice = 75;
    public static int totalTicketsOverall = 100000;
    public static int totalAvailableTickets = 25000;
    public static int totalOutdoorConcerts = 200;
    public static int totalInternationalConcerts = 100;
    public static String mostPopularArtist = "Artist Example";
    public static String mostPopularVenue = "Madison Square Garden";
    public static int totalCities = 100;
    public static int totalCountries = 50;
    public static double totalRevenue = 5000000.0;
    public static double highestTicketPrice = 500;
    public static double lowestTicketPrice = 20;
}


