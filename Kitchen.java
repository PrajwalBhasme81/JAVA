public class Kitchen
{
	public static void kitchenLocated()
	{
		String located = "Gadag";
		if(located == "Gadag")
		{
			System.out.println(" Some kitchens are Located in GADAG");	
		}
		else
		{
			System.out.println(" All Kitchens are Not Located in GADAG");	
		}
	}
	
	public static void kitchenName(String names[])	
	{
		for(int index=0;index<names.length;index++)
		{
			System.out.print(names[index]);
			if(names[index]=="Udapi Hotel")
			{
				System.out.println("Kitchen is no near to Railway Station");
			}
			else
			{
				System.out.println("Kitchen is near to Railway Station");
			}
		}
	}

	public static double openTime()
	{
		double openTime = 10.0;
		if(openTime<=10.0)
		{
			System.out.println("The Kitchen is Open at 8:00 am");
		}
		else
		{
			System.out.println("The Kitchen is Open at 8:00 pm");
		}
		return 10.00;
	}
	
	
	public static boolean isPureWaterInKitchen(boolean isPureWaterInKitchen)
	{
		if(isPureWaterInKitchen == true)
		{
			System.out.println("There is a Pure Water in Kitchen ");
		}
		else
		{
			System.out.println("There is a No Pure Water in Kitchen ");
		}
		return true;
	}
}