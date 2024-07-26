public class Indoor
{
	public int index = 0;
	String indoorNames[] = new String[4];
	
	public int getArrLength()
	{
		return indoorNames.length;
	}
	
	public String createIndoorArray(String indoor)
	{
		if(this.index < this.getArrLength())
		{
			indoorNames[index] = indoor;
			index++;
		}
		else
		{
			System.out.println("Array is Full");
		}
		return "Created Successfully";
	}
	
	public void readIndoorArray()
	{
		for(int index = 0;index < this.getArrLength();index++)
		{
			System.out.println("The Indoor Games are:"+indoorNames[index]);
		}
	}
	
	public String updateIndoorArray(String oldGame,String newGame)
	{
		for(int index = 0;index < this.getArrLength();index++)
		{
			if(indoorNames[index] == oldGame)
			{
				indoorNames[index] = newGame;
				System.out.println("The Updated Indoor Game is:"+newGame);
				return "Updated";
			}
		}
		return "Not Updated";
	}
	
	public String deleteIndoorArray(String indoor)
	{
		for(int index = 0;index < this.getArrLength();index++)
		{
			if(indoorNames[index] == indoor)
			{
				indoorNames[index] = null;
				System.out.println("The Deleted Indoor Game is:"+indoor);
				return "Deleted";
			}
		}
		return "Not Deleted";
	}
	
	public String searchIndoorArray(String indoorName)
	{
		for(String name: indoorNames)
		{
			if(indoorName == name)
			{
				return "Found :"+indoorName;
			}
		}
		return "Search Result not Found";
	}
}