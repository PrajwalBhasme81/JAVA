public class Food
{
	public static void displayFoodItems(String[] foodItemName,int[] quantity)
	{
		System.out.println("Displaying FoodItems ,Quantity ,TotalPrice");
		int pricePerItem = 10;
		
		 for (int i = 0; i < foodItemName.length; i++) 
		 {
            int totalItemPrice = quantity[i] * pricePerItem;
            System.out.println(foodItemName[i] + "," +quantity[i] + "," +totalItemPrice);
		 }
	}
}

