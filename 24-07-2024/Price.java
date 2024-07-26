public class Price
{
	public int index = 0;
	String priceNames[] = new String[4];
	
	public int getLengthOfArray()
	{
		return priceNames.length;
	}
	
	public String createArray(String names)
	{
		if(this.index < this.getLengthOfArray())
		{
			priceNames[index] = names;
			index++;
		}
		else
		{
			System.out.println("The Array is Full");
		}
		return "successful";
	}
	
	public String readArray()
	{
		for(int index = 0; index < this.getLengthOfArray(); index++)
		{	
			System.out.println(priceNames[index]);
		}
		return "Readed";
	}
}