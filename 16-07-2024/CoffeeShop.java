public class CoffeeShop 
{
    public CoffeeShop() 
	{
        System.out.println("Displaying Coffee Details");
    }

    public String blend;
    public String origin;
    public String roaster;
    public String roastLevel;
    public String grindType;
    public double price;
    public int quantityInStock;
    public boolean isOrganic;
    public boolean isFairTrade;
    public boolean isDecaf;
	public String name;
	public float quantity;
	public int varieties;

    public static int totalCoffees = 1000;
    public static double averagePrice = 15.0;
    public static int totalRoasters = 50;
    public static int totalOrigins = 10;
    public static String mostPopularBlend = "Espresso";
    public static double highestPrice = 50.0;
    public static double lowestPrice = 5.0;
}

