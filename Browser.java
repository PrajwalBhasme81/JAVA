public class Browser
{
	public static void Search()
	{
		String name = "Web Browser";
		System.out.println("The Name of the App is :"+name);
	}
	
	public static void Search(String Type, int Size)
	{
		System.out.println("The App Type is:"+Type+"  "+"The App size is:"+Size);
	}
	
	public static String Search(float rating)
	{
		String downloads = "1Cr+";
		System.out.println("The Total Downloads is :"+downloads+"  "+"The Rating is:"+rating);
		return "MethodEnd";
	}
	
	public static String Search(String features[])
	{
		for(int index = 0; index < features.length; index++)
		System.out.println("The Some Features are:"+features[index]);
		return "Method End";
	}
}
