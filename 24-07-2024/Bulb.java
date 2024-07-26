public class Bulb
{
	static String bulbType = "LED";
	static int watt;
	static String color;
	
	public static void type()
	{
		System.out.println("The Bulb Type is:"+bulbType);
	}
	
	public static void type(int watt)
	{
		Bulb.type();
		System.out.println("The Bulb watt is:"+watt);
	}
	
	public static void type(String color)
	{
		Bulb.type(1);
		System.out.println("The Bulb color is:"+color);
	}
}
