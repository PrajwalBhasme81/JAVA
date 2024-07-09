public class Irctc
{
	public static void Booking()
	{
		String type = "Ticket Booking";
		System.out.println("The Type of IRCTC is :"+type);
	}
	
	public static void Booking(String name, int size)
	{
		System.out.println("The Name of the App is :"+name+"  "+"The Size is :"+size);
	}
	
	public static String Booking(float users)
	{
		float rating = 4.7f;
		System.out.println("The Rating of the App is :"+rating+"  "+"The Total Users are :"+users);
		return "Method End";
	}
	
	public static String Booking(String types[])
	{
		for(int k = 0; k < types.length; k++)
			System.out.println("The Some Types of IRCTC Booking are:"+types[k]);
		return "Method end";
	}
}
	