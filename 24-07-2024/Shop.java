public class Shop
{
	public int index = 0;
	String shopNames[] = new String[4];
	
	public int getLengthOfArray()
	{
		return shopNames.length;
	}
	
	public String createArray(String names)
	{
		if(this.index < this.getLengthOfArray())
		{
			shopNames[index] = names;
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
			System.out.println(shopNames[index]);
		}
		return "Readed";
	}
}