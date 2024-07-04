public class Car
{
	public static void Name()
	{
		String carName = "Kia";
		int noOfSeates = 5;
		System.out.println("The Car Name is :"+carName);
		if(noOfSeates <= 5)
		{
			System.out.println("Seats are Sufficient");
		}
		else
		{
			System.out.println("Seats are Not Sufficient");
		}
	}
	
	public static void Brand(String brandName, long price)
	{
		System.out.println("The Car Brand is :"+brandName);
		if(price < 2000000)
		{
			System.out.println("The Car Price is Below 2 Lack:"+price);
		}
		else
		{
			System.out.println("The Car Price is More than 2 Lack :"+price);
		}
	}
	
	public static int rating()
	{
		int rating = 9;
		if(rating < 7)
		{
			System.out.println("Car is not good");
		}
		else
		{
			System.out.println("Car is good and Rating is :"+rating);
		}
		return 9;
	}
	
	public static String Branch(String place[],int noOfBranches)
	{
		for(int index=0;index<place.length;index++)
		{
			if(noOfBranches<20)
			{
				System.out.println("The Branches are:"+place[index]);
			}
			else
			{
				System.out.println("There is no branches present in that region");
			}
		}
		return "End";
	}
}
			