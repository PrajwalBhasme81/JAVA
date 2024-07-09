public class BlinkitRunner
{
	public static void main(String args[])
	{
		Blinkit.Grocery();
		Blinkit.Grocery("Blinkit:Glocery",17);
		Blinkit.Grocery(5f);
		String types[] = {"Vegitables","Fruits","Home-Items"};
		Blinkit.Grocery(types);
	}
}
