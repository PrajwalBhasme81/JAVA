public class Amazon01
{
	public static void Dress()
	{
		int numberOfCloth = 20;
		if(numberOfCloth < 50)
		{
			System.out.println("The Number of Cloths is less than 50");
		}
		else
		{
			System.out.println("The Number of Cloths is greater than 50");
		}
	}
	
	public static void Bat(String batName)
	{
		if(batName == "MRF")
		{
			System.out.println("The Bat Name is :"+batName);
		}
		else
		{
			System.out.println("it is not a given bat");
		}
	}
	
	public static String Shoes()
	{
		String shoeType = "Leather";
		if(shoeType == "Leather")
		{
			System.out.println("The Shoe Type is :"+shoeType);
		}
		else
		{
			System.out.println("Shoes is not a Leather Type");
		}
		return "MethodEnd";
	}
	
	public static String Mobile(String mobile_name)
	{
		if(mobile_name == "POCO")
		{
			System.out.println("Mobile Name is :"+mobile_name);
		}
		else
		{
			System.out.println("Mobile is Not POCO");
		}
		return "MethodEnd";
	}
}