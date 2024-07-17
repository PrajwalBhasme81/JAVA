public class Phone 
{
    public Phone()
	{
        System.out.println("Displaying Smartphone Details");
    }

    public String imei;
    public String brand;
    public String model;
    public String color;
    public double screenSize;
    public int storageGB;
    public String processor;
    public int ramGB;
    public boolean is5GCapable;
    public double price;
    public String osVersion;
    public String warrantyPeriod;
	public float weight;

    public static int totalSmartphones = 500000;
    public static double averagePrice = 600.0;
    public static int totalBrands = 20;
    public static int totalModels = 100;
    public static String mostPopularBrand = "Samsung";
    public static double highestPrice = 2000.0;
    public static double lowestPrice = 100.0;
}

