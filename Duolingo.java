public class Duolingo
{
	public static void Application()
	{
		String appname = "Duolingo";
		System.out.println("The Name of the App is :"+appname);
	}
	
	public static void Application(String Type, int Size)
	{
		System.out.println("The App Type is:"+Type+"  "+"The App size is:"+Size);
	}
	
	public static String Application(float rating)
	{
		String downloads = "50Cr+";
		System.out.println("The Total Downloads is :"+downloads+"  "+"The Rating is:"+rating);
		return "End";
	}
	
	public static String Application(String languages[])
	{
		for(int i = 0; i < languages.length; i++)
		System.out.println("The Some Languages are:"+languages[i]);
		return "Method End";
	}
}
