public class EarBuds
{
	public String name;
	public float price;
	public String color;
	public int size;
	public boolean isWaterResistant;
	public float rating;
	
	public EarBuds()
	{
		System.out.println("------------------------------");
		System.out.println("No argument constructor");
	}
	
	public EarBuds(String name)
	{
		this.name = name;
		System.out.println("------------------------------");
		System.out.println("1 argument constructor");
		System.out.println("The EarBuds name is:"+name);
	}
	
	public EarBuds(String name,float price)
	{
		this.name = name;
		this.price = price;
		System.out.println("------------------------------");
		System.out.println("2 argument constructor");
		System.out.println("The EarBuds name is:"+name);
		System.out.println("The EarBuds price is:"+price);
	}
	
	public EarBuds(String name,float price,String color)
	{
		this.name = name;
		this.price = price;
		this.color = color;
		System.out.println("------------------------------");
		System.out.println("3 argument constructor");
		System.out.println("The EarBuds name is:"+name);
		System.out.println("The EarBuds price is:"+price);
		System.out.println("The EarBuds color is:"+color);
	}
	
	public EarBuds(String name,float price,String color,int size)
	{
		this.name = name;
		this.price = price;
		this.color = color;
		this.size = size;
		System.out.println("------------------------------");
		System.out.println("4 argument constructor");
		System.out.println("The EarBuds name is:"+name);
		System.out.println("The EarBuds price is:"+price);
		System.out.println("The EarBuds color is:"+color);
		System.out.println("The EarBuds size is:"+size);
	}
	
	public EarBuds(String name,float price,String color,int size,boolean isWaterResistant)
	{
		this.name = name;
		this.price = price;
		this.color = color;
		this.size = size;
		this.isWaterResistant = isWaterResistant;
		System.out.println("------------------------------");
		System.out.println("5 argument constructor");
		System.out.println("The EarBuds name is:"+name);
		System.out.println("The EarBuds price is:"+price);
		System.out.println("The EarBuds color is:"+color);
		System.out.println("The EarBuds size is:"+size);
		System.out.println("The EarBuds isWaterResistant is:"+isWaterResistant);
	}
	
	public EarBuds(String name,float price,String color,int size,boolean isWaterResistant,float rating)
	{
		this.name = name;
		this.price = price;
		this.color = color;
		this.size = size;
		this.isWaterResistant = isWaterResistant;
		this.rating = rating;
		System.out.println("------------------------------");
		System.out.println("6 argument constructor");
		System.out.println("The EarBuds name is:"+name);
		System.out.println("The EarBuds price is:"+price);
		System.out.println("The EarBuds color is:"+color);
		System.out.println("The EarBuds size is:"+size);
		System.out.println("The EarBuds isWaterResistant is:"+isWaterResistant);
		System.out.println("The EarBuds rating is:"+rating);
	}
}