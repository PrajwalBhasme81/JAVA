public class FoodRunner 
{
    public static void main(String[] args) 
	{
        String[] foodItemName = {
            "Biryani", "Masala Dosa", "Paneer Butter Masala", "Idly vada",
            "Bisi Bele Bath", "Pav Bhaji", "Aloo Paratha", "Samosa",
            "Vada Pav", "Pani Puri", "Puri", "Gulab Jamun",
            "Tandoori Chicken", "Momos", "Kachori", "Seva Puri",
            "Palak Paneer", "Fride Rice", "Tomato Bath", "Jalebi"};

        int[] quantity = {2, 3, 1, 4, 2, 3, 2, 5, 4, 3,2, 3, 1, 2, 3, 4, 2, 3, 1, 4};

        Food.displayFoodItems(foodItemName,quantity);
	}
}