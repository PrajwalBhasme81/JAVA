public class Applications
{
	public static String app()
	{
		String appName = "Instagram";
		System.out.println("The Application Name is:"+appName);
		return "End";
	}
	
	public static String app(double version)
	{
		System.out.println("The Version is:"+version);
		return "End";
	}
	
	public static String app(String appName,double version)
	{
		System.out.println("The Application is:"+appName);
		System.out.println("The Version is:"+version);
		return "End";
	}
	
	public static String app(String appName,String developer,double version)
	{
		System.out.println("The Application is:"+appName);
		System.out.println("The Application Developer is:"+developer);
		System.out.println("The Version is:"+version);
		return "End";
	}
	
	public static String app(String appName,String developer,double version,int numDownloads)
	{
		System.out.println("The Application is:"+appName);
		System.out.println("The Application Developer is:"+developer);
		System.out.println("The Version is:"+version);
		System.out.println("The Total Downloads is:"+numDownloads);
		return "End";
	}
	
	public static String app(String appName,String developer,double version,float appSize,int numDownloads)
	{
		System.out.println("The Application is:"+appName);
		System.out.println("The Application Developer is:"+developer);
		System.out.println("The Version is:"+version);
		System.out.println("The App Size is:"+appSize);
		System.out.println("The Total Downloads is:"+numDownloads);
		return "End";
	}
	
	public static String app(String appName,float rating,String developer,double version,float appSize,int numDownloads)
	{
		System.out.println("The Application is:"+appName);
		System.out.println("The Rating is:"+rating);
		System.out.println("The Application Developer is:"+developer);
		System.out.println("The Version is:"+version);
		System.out.println("The App Size is:"+appSize);
		System.out.println("The Total Downloads is:"+numDownloads);
		return "End";
	}
	
	public static String app(String appName,float rating,String developer,double version,float appSize,int numDownloads,String appType)
	{
		System.out.println("The Application is:"+appName);
		System.out.println("The Rating is:"+rating);
		System.out.println("The Application Developer is:"+developer);
		System.out.println("The Version is:"+version);
		System.out.println("The App Size is:"+appSize);
		System.out.println("The Total Downloads is:"+numDownloads);
		System.out.println("The App Type is:"+appType);
		return "End";
	}
	
	public static String app(String appName,float rating,String developer,double version,String platform,float appSize,int numDownloads,String appType)
	{
		System.out.println("The Application is:"+appName);
		System.out.println("The Rating is:"+rating);
		System.out.println("The Application Developer is:"+developer);
		System.out.println("The Version is:"+version);
		System.out.println("The App Platform is:"+platform);
		System.out.println("The App Size is:"+appSize);
		System.out.println("The Total Downloads is:"+numDownloads);
		System.out.println("The App Type is:"+appType);
		return "End";
	}
	
	public static String app(String appName,float rating,String developer,double version,int releaseYear,String platform,float appSize,int numDownloads,String appType)
	{
		System.out.println("The Application is:"+appName);
		System.out.println("The Rating is:"+rating);
		System.out.println("The Application Developer is:"+developer);
		System.out.println("The Version is:"+version);
		System.out.println("The Release Year is:"+releaseYear);	
		System.out.println("The App Platform is:"+platform);
		System.out.println("The App Size is:"+appSize);
		System.out.println("The Total Downloads is:"+numDownloads);
		System.out.println("The App Type is:"+appType);
		return "End";
	}
	
	public static String app(String appName,float rating,String developer,double version,String purpose,int releaseYear,String platform,float appSize,int numDownloads,String appType)
	{
		System.out.println("The Application is:"+appName);
		System.out.println("The Rating is:"+rating);
		System.out.println("The Application Developer is:"+developer);
		System.out.println("The Version is:"+version);
		System.out.println("The Purpose is:"+purpose);
		System.out.println("The Release Year is:"+releaseYear);	
		System.out.println("The App Platform is:"+platform);
		System.out.println("The App Size is:"+appSize);
		System.out.println("The Total Downloads is:"+numDownloads);
		System.out.println("The App Type is:"+appType);
		return "End";
	}
}