public class JioCinema
{
	public static void Ott()
	{
		String name = "Jio Cinema";
		System.out.println("The Name of the App is :"+name);
	}
	
	public static void Ott(String Type, int Size)
	{
		System.out.println("The App Type is:"+Type+"  "+"The App size is:"+Size);
	}
	
	public static String Ott(float rating)
	{
		String downloads = "15Cr+";
		System.out.println("The Total Downloads is :"+downloads+"  "+"The Rating is:"+rating);
		return "End";
	}
	
	public static String Ott(String categories[])
	{
		for(int c = 0; c < categories.length; c++)
		System.out.println("The Some Categories are:"+categories[c]);
		return "Method End";
	}
}
