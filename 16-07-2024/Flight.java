public class Flight 
{
    public Flight() 
	{
        System.out.println("Displaying Flight Details");
    }
    
    public String flightNumber;
    public String airline;
    public String departureCity;
    public String arrivalCity;
    public String departureTime;
    public String arrivalTime;
    public int durationMinutes;
    public String ticketterminal;
    public String aircraftType;
    public int totalSeats;
    public int availableSeats;
    public boolean isNonStop;
    public String gate;
    public String terminal;

    public static int totalFlights = 3000;
    public static double averageTicketPrice = 300;
    public static int totalSeatsOverall = 60000;
    public static int totalAvailableSeats = 10000;
    public static int totalNonStopFlights = 1500;
    public static int totalInternationalFlights = 1000;
    public static String busiestAirline = "Air Example";
    public static String mostPopularRoute = "NYC to LAX";
    public static int totalAirlines = 100;
    public static int totalGates = 200;
    public static int totalTerminals = 20;
    public static int totalDurationMinutes = 1000000;
    public static double totalRevenue = 90000000.0;
    public static double highestTicketPrice = 1500;
    public static double lowestTicketPrice = 50;
}
