public class Mobile
{
	public int index = 0;
	String brandNames[] = new String[4];
	
	public int getBrandArrayLength()
	{
		return brandNames.length;
	}
	
	public String createBrandArray(String brand)
	{
		if(this.index < this.getBrandArrayLength())
		{
			brandNames[index] = brand;
			index++;
		}
		else
		{
			System.out.println("The Array is Full");
		}
		return "Save successfully";
	}
	
	public void readBrandArray()
	{
		for(int index = 0; index < this.getBrandArrayLength();index++)
		{
			System.out.println("The Mobile Brand Names are:"+brandNames[index]);
		}
	}
	
	public String updateBrandArray(String oldBrand,String newBrand)
	{
		for(int index = 0;index < this.getBrandArrayLength();index++)
		{
			if(brandNames[index] == oldBrand)
			{
				brandNames[index] = newBrand;
				System.out.println("The Mobile Brand Names are:"+brandNames[index]);
				return "Updated ";
			}
		}
		return "Updated Failed";
	}
	
	public String deleteBrandArray(String brand)
	{
		for(int index = 0;index < this.getBrandArrayLength(); index++)
		{
			if(brandNames[index] == brand)
			{
				brandNames[index] = null;
				System.out.println("The Mobile Brand Names are:"+brandNames[index]);
				return "Delete Successfully";
			}
		}
		return "Not Found to Delete";
	}
	
	public String searchByBrandArray(String brand)
	{
		for(String name: brandNames)
		{
			if(brand == name)
			{
				return "Found :"+brand;
			}
		}
		return "Search Result not Found";
	}
}
			
		