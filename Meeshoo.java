public class Meeshoo
{
	public static void Dress()
	{
		int numberOfCloth = 70;
		if(numberOfCloth < 50)
		{
			System.out.println("The Number of Cloths is less than 50");
		}
		else
		{
			System.out.println("The Number of Cloths is greater than 50");
		}
	}
	
	public static void Ball(String ballName)
	{
		if(ballName == "Cork")
		{
			System.out.println("The Ball Name is :"+ballName);
		}
		else
		{
			System.out.println("it is not a given ball");
		}
	}
	
	public static String Shoes()
	{
		String shoeType = "Formal";
		if(shoeType == "Formal")
		{
			System.out.println("The Shoe Type is :"+shoeType);
		}
		else
		{
			System.out.println("Shoes is not a Formal Type");
		}
		return "MethodEnd";
	}
	
	public static String Mobile(String mobile_name)
	{
		if(mobile_name == "Nothing")
		{
			System.out.println("Mobile Name is :"+mobile_name);
		}
		else
		{
			System.out.println("Mobile is Not Nothing");
		}
		return "MethodEnd";
	}
}