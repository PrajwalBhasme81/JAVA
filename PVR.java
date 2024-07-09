public class PVR
{
	public static void Ticket()
	{
		String type = "Movie Ticket Booking";
		System.out.println("The Type of PVR is :"+type);
	}
	
	public static void Ticket(String name, int size)
	{
		System.out.println("The Name of the App is :"+name+"  "+"The Size is :"+size);
	}
	
	public static String Ticket(float users)
	{
		float rating = 4.1f;
		System.out.println("The Rating of the App is :"+rating+"  "+"The Total Users are :"+users);
		return "Method End";
	}
	
	public static String Ticket(String types[])
	{
		for(int p = 0; p < types.length; p++)
			System.out.println("The Some Types of PVR Booking are:"+types[p]);
		return "Method end";
	}
}
	