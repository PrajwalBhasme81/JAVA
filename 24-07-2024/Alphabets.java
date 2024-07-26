public class Alphabets
{
	public int index = 0;
	String alphabetsNames[] = new String[9];
	
	public int getLengthOfArray()
	{
		return alphabetsNames.length;
	}
	
	public String createArray(String names)
	{
		if(this.index < this.getLengthOfArray())
		{
			alphabetsNames[index] = names;
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
			System.out.println(alphabetsNames[index]);
		}
		return "Readed";
	}
}