public class Parks
{
	public static void Name()
	{
		String parkname = "Kuvempu Park";
		int noOfYears = 3;
		System.out.println("Name of the Park is:"+parkname);
		if(noOfYears <= 4)
		{
			System.out.println("Completed Years of Park is :"+noOfYears);
		}
		else
		{
			System.out.println("There is No Park");
		}
	}

	public static void location(String address,int pincode)
	{
		System.out.println("The Park present in location:"+address);
		if(pincode < 582101)
		{
			System.out.println("Location Pincode is:"+pincode);
		}
		else
		{
			System.out.println("Pincode not found");
		}
	}

	public static int invest()
	{
		long invest = 20000000;
		int noofworkers = 45;
		if(noofworkers < 50)
		{
			System.out.println("Park invest amount is :"+invest);
		}
		else
		{
			System.out.println("No Park are Constructed");
		}
		return 50;
	}

	public static String park(int square,String areas[])
	{
		for(int index=0;index<areas.length;index++)
		{
			if(square<1000)
			{
				System.out.println("Park Present areas are:"+areas[index]);
			}
			else
			{
				System.out.println("Park is not present");
			}
		}
		return "End";
	}
}