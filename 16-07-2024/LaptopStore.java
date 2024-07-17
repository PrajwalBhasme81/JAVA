public class LaptopStore 
{
    public Laptop() 
	{
        System.out.println("Displaying Laptop Details");
    }

    public String serialNumber;
    public String brand;
    public String model;
    public double screenSize;
    public String processor;
    public int ramGB;
    public int storageGB;
    public String operatingSystem;
    public boolean isTouchscreen;
    public boolean hasBacklitKeyboard;
    public double price;
    public String color;
	public float weight;

    public static int totalLaptops = 10000;
    public static double averagePrice = 1200.0;
    public static int totalBrands = 20;
    public static int totalModels = 200;
    public static String mostPopularProcessor = "Intel Core i7";
    public static double highestPrice = 3000.0;
    public static double lowestPrice = 500.0;
}

