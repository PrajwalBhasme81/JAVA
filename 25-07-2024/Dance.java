public class Dance
{
	public int index = 0;
	String danceNames[] = new String[4];
	
	public int getArrLength()
	{
		return danceNames.length;
	}
	
	public String createdanceArray(String dance)
	{
		if(this.index < this.getArrLength())
		{
			danceNames[index] = dance;
			index++;
		}
		else
		{
			System.out.println("Array is Full");
		}
		return "Created Successfully";
	}
	
	public void readdanceArray()
	{
		for(int index = 0;index < this.getArrLength();index++)
		{
			System.out.println("The dance Games are:"+danceNames[index]);
		}
	}
	
	public String updatedanceArray(String oldGame,String newGame)
	{
		for(int index = 0;index < this.getArrLength();index++)
		{
			if(danceNames[index] == oldGame)
			{
				danceNames[index] = newGame;
				System.out.println("The Updated dance Game is:"+newGame);
				return "Updated";
			}
		}
		return "Not Updated";
	}
	
	public String deletedanceArray(String dance)
	{
		for(int index = 0;index < this.getArrLength();index++)
		{
			if(danceNames[index] == dance)
			{
				danceNames[index] = null;
				System.out.println("The Deleted dance Game is:"+dance);
				return "Deleted";
			}
		}
		return "Not Deleted";
	}
	
	public String searchdanceArray(String danceName)
	{
		for(String name: danceNames)
		{
			if(danceName == name)
			{
				return "Found :"+danceName;
			}
		}
		return "Search Result not Found";
	}
}