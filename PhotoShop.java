public class PhotoShop
{
	public static void App()
	{
		String appname = "Photo Shop";
		System.out.println("The Name of the App is :"+appname);
	}
	
	public static void App(String Type, int Size)
	{
		System.out.println("The App Type is:"+Type+"  "+"The App size is:"+Size);
	}
	
	public static String App(float rating)
	{
		String downloads = "10Cr+";
		System.out.println("The Total Downloads is :"+downloads+"  "+"The Rating is:"+rating);
		return "End";
	}
	
	public static String App(String tools[])
	{
		for(int j = 0; j < tools.length; j++)
		System.out.println("The Some Tools are:"+tools[j]);
		return "Method End";
	}
}