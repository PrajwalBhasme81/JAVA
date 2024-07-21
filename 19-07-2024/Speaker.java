public class Speaker
{
	public String name;
	public float price;
	public String color;
	public int size;
	public boolean isWaterResistant;
	public float rating;
	
	public Speaker()
	{
		System.out.println("------------------------------");
		System.out.println("No argument constructor");
	}
	
	public Speaker(String name)
	{
		this.name = name;
		System.out.println("------------------------------");
		System.out.println("1 argument constructor");
		System.out.println("The Speaker name is:"+name);
	}
	
	public Speaker(String name,float price)
	{
		this.name = name;
		this.price = price;
		System.out.println("------------------------------");
		System.out.println("2 argument constructor");
		System.out.println("The Speaker name is:"+name);
		System.out.println("The Speaker price is:"+price);
	}
	
	public Speaker(String name,float price,String color)
	{
		this.name = name;
		this.price = price;
		this.color = color;
		System.out.println("------------------------------");
		System.out.println("3 argument constructor");
		System.out.println("The Speaker name is:"+name);
		System.out.println("The Speaker price is:"+price);
		System.out.println("The Speaker color is:"+color);
	}
	
	public Speaker(String name,float price,String color,int size)
	{
		this.name = name;
		this.price = price;
		this.color = color;
		this.size = size;
		System.out.println("------------------------------");
		System.out.println("4 argument constructor");
		System.out.println("The Speaker name is:"+name);
		System.out.println("The Speaker price is:"+price);
		System.out.println("The Speaker color is:"+color);
		System.out.println("The Speaker size is:"+size);
	}
	
	public Speaker(String name,float price,String color,int size,boolean isWaterResistant)
	{
		this.name = name;
		this.price = price;
		this.color = color;
		this.size = size;
		this.isWaterResistant = isWaterResistant;
		System.out.println("------------------------------");
		System.out.println("5 argument constructor");
		System.out.println("The Speaker name is:"+name);
		System.out.println("The Speaker price is:"+price);
		System.out.println("The Speaker color is:"+color);
		System.out.println("The Speaker size is:"+size);
		System.out.println("The Speaker isWaterResistant is:"+isWaterResistant);
	}
	
	public Speaker(String name,float price,String color,int size,boolean isWaterResistant,float rating)
	{
		this.name = name;
		this.price = price;
		this.color = color;
		this.size = size;
		this.isWaterResistant = isWaterResistant;
		this.rating = rating;
		System.out.println("------------------------------");
		System.out.println("6 argument constructor");
		System.out.println("The Speaker name is:"+name);
		System.out.println("The Speaker price is:"+price);
		System.out.println("The Speaker color is:"+color);
		System.out.println("The Speaker size is:"+size);
		System.out.println("The Speaker isWaterResistant is:"+isWaterResistant);
		System.out.println("The Speaker rating is:"+rating);
	}
}