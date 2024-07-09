public class KukuFM
{
	public static void FM()
	{
		String name = "KukuFM AudioBook";
		System.out.println("The Name of the App is :"+name);
	}
	
	public static void FM(String Type, int Size)
	{
		System.out.println("The App Type is:"+Type+"  "+"The App size is:"+Size);
	}
	
	public static String FM(float rating)
	{
		String downloads = "5Cr+";
		System.out.println("The Total Downloads is :"+downloads+"  "+"The Rating is:"+rating);
		return "End";
	}
	
	public static String FM(String languages[])
	{
		for(int i = 0; i < languages.length; i++)
		System.out.println("The Some Languages are:"+languages[i]);
		return "Method End";
	}
}
