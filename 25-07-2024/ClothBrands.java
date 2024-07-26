public class ClothBrands
{
	public int index = 0;
	String brand[] = new String[4];
	
	public int getLengthOfArray()
	{
		return brand.length;
	}
	
	public String saveArray(String brands)
	{
		System.out.println("The Brand is:"+brands);
		if(this.index < this.getLengthOfArray())
		{
			brand[index] = brands;
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
			System.out.println(brand[index]);
		}
		return "brand";
	}
}
	
	
	
	
	