public class Train01
{
    public Train01() 
	{
        System.out.println("Displaying Train Details");
    }
    
    public String trainNumber;
    public String trainName;
    public String departureStation;
    public String arrivalStation;
    public String departureTime;
    public String arrivalTime;
    public int durationMinutes;
    public String ticketClass;
    public String coachType;
    public int totalSeats;
    public int availableSeats;
    public boolean isNonStop;
    public String platform;
    public String terminal;

    public static int totalTrains = 5000;
    public static double averageTicketPrice = 150;
    public static int totalSeatsOverall = 120000;
    public static int totalAvailableSeats = 30000;
    public static int totalNonStopTrains = 2000;
    public static int totalInternationalTrains = 500;
    public static String busiestTrainOperator = "Rail Example";
    public static String mostPopularRoute = "NYC to Boston";
    public static int totalTrainOperators = 50;
    public static int totalPlatforms = 300;
    public static int totalTerminals = 10;
    public static int totalDurationMinutes = 2000000;
    public static double totalRevenue = 60000000.0;
    public static double highestTicketPrice = 500;
    public static double lowestTicketPrice = 20;
}

