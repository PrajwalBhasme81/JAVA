public class Outdoor
{
	public int index = 0;
	String outdoorNames[] = new String[4];
	
	public int getArrLength()
	{
		return outdoorNames.length;
	}
	
	public String createoutdoorArray(String outdoor)
	{
		if(this.index < this.getArrLength())
		{
			outdoorNames[index] = outdoor;
			index++;
		}
		else
		{
			System.out.println("Array is Full");
		}
		return "Created Successfully";
	}
	
	public void readoutdoorArray()
	{
		for(int index = 0;index < this.getArrLength();index++)
		{
			System.out.println("The outdoor Games are:"+outdoorNames[index]);
		}
	}
	
	public String updateoutdoorArray(String oldGame,String newGame)
	{
		for(int index = 0;index < this.getArrLength();index++)
		{
			if(outdoorNames[index] == oldGame)
			{
				outdoorNames[index] = newGame;
				System.out.println("The Updated outdoor Game is:"+newGame);
				return "Updated";
			}
		}
		return "Not Updated";
	}
	
	public String deleteoutdoorArray(String outdoor)
	{
		for(int index = 0;index < this.getArrLength();index++)
		{
			if(outdoorNames[index] == outdoor)
			{
				outdoorNames[index] = null;
				System.out.println("The Deleted outdoor Game is:"+outdoor);
				return "Deleted";
			}
		}
		return "Not Deleted";
	}
	
	public String searchoutdoorArray(String outdoorName)
	{
		for(String name: outdoorNames)
		{
			if(outdoorName == name)
			{
				return "Found :"+outdoorName;
			}
		}
		return "Search Result not Found";
	}
}