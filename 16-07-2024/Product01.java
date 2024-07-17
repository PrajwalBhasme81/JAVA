public class Product01
{
    public Product01() 
	{
        System.out.println("Displaying Product Details");
    }

    public String productID;
    public String productName;
    public String category;
    public String brand;
    public double price;
    public int stockQuantity;
    public String supplier;
    public double weight;
    public String dimensions;
    public String color;
    public String material;
    public boolean isReturnable;
    public String warrantyPeriod;
    public double rating;

    public static int totalProducts = 10000;
    public static double averagePrice = 50;
    public static int totalStock = 500000;
    public static int totalAvailableStock = 450000;
    public static int totalReturnableProducts = 7000;
    public static double highestPrice = 5000;
    public static double lowestPrice = 1;
    public static String mostPopularBrand = "Brand Example";
    public static String mostPopularCategory = "Electronics";
    public static double totalRevenue = 500000000.0;
}


