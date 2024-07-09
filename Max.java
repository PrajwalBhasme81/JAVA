public class Max
{
	public static void Shopping()
	{
		String type = "Online Shopping";
		System.out.println("The Type of Max is :"+type);
	}
	
	public static void Shopping(String name, int size)
	{
		System.out.println("The Name of the App is :"+name+"  "+"The Size is :"+size);
	}
	
	public static String Shopping(float users)
	{
		float rating = 3.7f;
		System.out.println("The Rating of the App is :"+rating+"  "+"The Total Users are :"+users);
		return "Method End";
	}
	
	public static String Shopping(String types[])
	{
		for(int s = 0; s < types.length; s++)
			System.out.println("The Some Category of Online Shopping are:"+types[s]);
		return "Method end";
	}
}
	