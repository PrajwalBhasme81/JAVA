public class FoodItemRunner
{
	public static void main(String args[])
	{
		FoodItem.foodItem();
		FoodItem.foodItem("Pizza");
		FoodItem.foodItem("Salad", "Appetizer");
		FoodItem.foodItem("Burger", "Main Course", 8.99);
		FoodItem.foodItem("Pasta", "Main Course", 12.50, "Spaghetti with marinara sauce");
		FoodItem.foodItem("Salad", "Appetizer", 5.99, "Mixed greens with balsamic dressing", true);
		FoodItem.foodItem("Sandwich", "Main Course", 6.50, "Club sandwich with turkey and bacon", false, true);
		FoodItem.foodItem("Smoothie", "Beverage", 4.25, "Mixed fruit smoothie", true, true, true);
		FoodItem.foodItem("Cheesecake", "Dessert", 3.99, "New York style cheesecake", true, true, true, true);
		FoodItem.foodItem("Sushi", "Appetizer", 15.99, "Assorted sushi rolls", true, true, true, true, 300);
		FoodItem.foodItem("Sushi", "Appetizer", 15.99, "Assorted sushi rolls", true, true, true, true, 300,"Indian");
	}
}
		
		