public class Cruise 
{
    public Cruise()
	{
        System.out.println("Displaying Cruise Details");
    }

    public String cruiseID;
    public String cruiseLine;
    public String departurePort;
    public String arrivalPort;
    public String departureDate;
    public String arrivalDate;
    public int durationDays;
    public String cabinType;
    public String shipType;
    public int totalCabins;
    public int availableCabins;
    public boolean isRoundTrip;
    public String dock;
    public String terminal;

    public static int totalCruises = 1000;
    public static double averageTicketPrice = 800;
    public static int totalCabinsOverall = 50000;
    public static int totalAvailableCabins = 20000;
    public static int totalRoundTrips = 700;
    public static int totalInternationalCruises = 400;
    public static String busiestCruiseLine = "Cruise Example";
    public static String mostPopularRoute = "Miami to Bahamas";
    public static int totalCruiseLines = 20;
    public static int totalDocks = 50;
    public static int totalTerminals = 10;
    public static int totalDurationDays = 15000;
    public static double totalRevenue = 50000000.0;
    public static double highestTicketPrice = 5000;
    public static double lowestTicketPrice = 200;
}


