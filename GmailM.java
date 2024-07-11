public class GmailM
{
	public static void Message()
	{
		String appname = "Gmail";
		System.out.println("The Name of the App is :"+appname);
	}
	
	public static void Message(String Type, int Size)
	{
		System.out.println("The App Type is:"+Type+"  "+"The App size is:"+Size);
	}
	
	public static String Message(float rating)
	{
		String downloads = "1000Cr+";
		System.out.println("The Total Downloads is :"+downloads+"  "+"The Rating is:"+rating);
		return "Method End";
	}
	
	public static String Message(String features[])
	{
		for(int m = 0; m < features.length; m++)
		System.out.println("The Some Features are:"+features[m]);
		return "Method End";
	}
}