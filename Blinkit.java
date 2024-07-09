public class Blinkit
{
	public static void Grocery()
	{
		String type = "Online Shopping";
		System.out.println("The Type of Max is :"+type);
	}
	
	public static void Grocery(String name, int size)
	{
		System.out.println("The Name of the App is :"+name+"  "+"The Size is :"+size);
	}
	
	public static String Grocery(float users)
	{
		float rating = 3.7f;
		System.out.println("The Rating of the App is :"+rating+"  "+"The Total Users are :"+users);
		return "Method End";
	}
	
	public static String Grocery(String types[])
	{
		for(int g = 0; g < types.length; g++)
			System.out.println("The Some Category of Online Shopping are:"+types[g]);
		return "Method end";
	}
}
	