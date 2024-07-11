public class FoodItem 
{
    public static String foodItem() {
		String itemName = "Pizza";
		System.out.println("The Food Item Name is:"+itemName);
		return itemName;
    }

    public static String foodItem(String itemName) 
	{
        System.out.println("The Food Item Name is:"+itemName);
		return itemName;
    }

    public static String foodItem(String itemName, String category) 
	{
       System.out.println("The Food Item Name is:"+itemName);
	   System.out.println("The Food Category is:"+category);
	   return category;
    }

    public static double foodItem(String itemName, String category, double price) 
	{
       System.out.println("The Food Item Name is:"+itemName);
	   System.out.println("The Food Category is:"+category);
	   System.out.println("The Food Price is:"+price);
	   return price;
    }

    public static String foodItem(String itemName, String category, double price, String description) 
	{
       System.out.println("The Food Item Name is:"+itemName);
	   System.out.println("The Food Category is:"+category);
	   System.out.println("The Food Price is:"+price);
	   System.out.println("The Food Description is:"+description);
	   return description;
    }

    public static boolean foodItem(String itemName, String category, double price, String description, boolean isVegetarian) 
	{
       System.out.println("The Food Item Name is:"+itemName);
	   System.out.println("The Food Category is:"+category);
	   System.out.println("The Food Price is:"+price);
	   System.out.println("The Food Description is:"+description);
	   System.out.println("The Food is Vegetarian :"+isVegetarian);
	   return isVegetarian;
    }

    public static boolean foodItem(String itemName, String category, double price, String description, boolean isVegetarian,boolean isGlutenFree) 
	{
       System.out.println("The Food Item Name is:"+itemName);
	   System.out.println("The Food Category is:"+category);
	   System.out.println("The Food Price is:"+price);
	   System.out.println("The Food Description is:"+description);
	   System.out.println("The Food is Vegetarian :"+isVegetarian);
	   System.out.println("The Food is GlutenFree :"+isGlutenFree);
	   return isGlutenFree;
    }

    public static boolean foodItem(String itemName, String category, double price, String description, boolean isVegetarian,boolean isGlutenFree, boolean isOrganic) 
	{
       System.out.println("The Food Item Name is:"+itemName);
	   System.out.println("The Food Category is:"+category);
	   System.out.println("The Food Price is:"+price);
	   System.out.println("The Food Description is:"+description);
	   System.out.println("The Food is Vegetarian :"+isVegetarian);
	   System.out.println("The Food is GlutenFree :"+isGlutenFree);
	   System.out.println("The Food is Organic :"+isOrganic);
	   return isOrganic;
    }

    public static boolean foodItem(String itemName, String category, double price, String description, boolean isVegetarian,boolean isGlutenFree, boolean isOrganic, 
					boolean isAvailable)
	{
       System.out.println("The Food Item Name is:"+itemName);
	   System.out.println("The Food Category is:"+category);
	   System.out.println("The Food Price is:"+price);
	   System.out.println("The Food Description is:"+description);
	   System.out.println("The Food is Vegetarian :"+isVegetarian);
	   System.out.println("The Food is GlutenFree :"+isGlutenFree);
	   System.out.println("The Food is Organic :"+isOrganic);
	   System.out.println("The Food is Available :"+isAvailable);
	   return isAvailable;
    }

    public static int foodItem(String itemName, String category, double price, String description, boolean isVegetarian,boolean isGlutenFree, boolean isOrganic, 
					boolean isAvailable, int calories) 
	{
       System.out.println("The Food Item Name is:"+itemName);
	   System.out.println("The Food Category is:"+category);
	   System.out.println("The Food Price is:"+price);
	   System.out.println("The Food Description is:"+description);
	   System.out.println("The Food is Vegetarian :"+isVegetarian);
	   System.out.println("The Food is GlutenFree :"+isGlutenFree);
	   System.out.println("The Food is Organic :"+isOrganic);
	   System.out.println("The Food is Available :"+isAvailable);
	   System.out.println("The Food Calories :"+calories);
	   return calories;
    }

    public static String foodItem(String itemName, String category, double price, String description, boolean isVegetarian,
                    boolean isGlutenFree, boolean isOrganic, boolean isAvailable, int calories, String countryOfOrigin) {
      System.out.println("The Food Item Name is:"+itemName);
	   System.out.println("The Food Category is:"+category);
	   System.out.println("The Food Price is:"+price);
	   System.out.println("The Food Description is:"+description);
	   System.out.println("The Food is Vegetarian :"+isVegetarian);
	   System.out.println("The Food is GlutenFree :"+isGlutenFree);
	   System.out.println("The Food is Organic :"+isOrganic);
	   System.out.println("The Food is Available :"+isAvailable);
	   System.out.println("The Food Calories :"+calories);
	   System.out.println("The Food CountryOfOrigin :"+countryOfOrigin);
	   return countryOfOrigin;
    }

}

    