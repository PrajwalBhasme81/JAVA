public class Kinemaster
{
	public static void Type()
	{
		String appType = "Editor";
		System.out.println("The App Type is:"+appType);
	}
	
	public static void Type(String type,int size)
	{
		System.out.println("The Application Type is:"+type+"  "+"App Size is:"+size);
	}
	
	public static String Type(float rating)
	{
		String downloads = "10Cr+";
		System.out.println("The Total Downloads is:"+downloads+"  "+"The Rating Of the App is:"+rating);
		return "End";
	}
	
	public static String Type(String features[])
	{
		for(int index = 0; index < features.length; index++)
		System.out.println("The Features are:"+features[index]);
		return "Method End";
	}
}
