public class SmartWatch
{
	public String name;
	public float price;
	public String color;
	public int size;
	public boolean isWaterResistant;
	public float rating;
	
	public SmartWatch()
	{
		System.out.println("------------------------------");
		System.out.println("No argument constructor");
	}
	
	public SmartWatch(String name)
	{
		this.name = name;
		System.out.println("------------------------------");
		System.out.println("1 argument constructor");
		System.out.println("The SmartWatch name is:"+name);
	}
	
	public SmartWatch(String name,float price)
	{
		this.name = name;
		this.price = price;
		System.out.println("------------------------------");
		System.out.println("2 argument constructor");
		System.out.println("The SmartWatch name is:"+name);
		System.out.println("The SmartWatch price is:"+price);
	}
	
	public SmartWatch(String name,float price,String color)
	{
		this.name = name;
		this.price = price;
		this.color = color;
		System.out.println("------------------------------");
		System.out.println("3 argument constructor");
		System.out.println("The SmartWatch name is:"+name);
		System.out.println("The SmartWatch price is:"+price);
		System.out.println("The SmartWatch color is:"+color);
	}
	
	public SmartWatch(String name,float price,String color,int size)
	{
		this.name = name;
		this.price = price;
		this.color = color;
		this.size = size;
		System.out.println("------------------------------");
		System.out.println("4 argument constructor");
		System.out.println("The SmartWatch name is:"+name);
		System.out.println("The SmartWatch price is:"+price);
		System.out.println("The SmartWatch color is:"+color);
		System.out.println("The SmartWatch size is:"+size);
	}
	
	public SmartWatch(String name,float price,String color,int size,boolean isWaterResistant)
	{
		this.name = name;
		this.price = price;
		this.color = color;
		this.size = size;
		this.isWaterResistant = isWaterResistant;
		System.out.println("------------------------------");
		System.out.println("5 argument constructor");
		System.out.println("The SmartWatch name is:"+name);
		System.out.println("The SmartWatch price is:"+price);
		System.out.println("The SmartWatch color is:"+color);
		System.out.println("The SmartWatch size is:"+size);
		System.out.println("The SmartWatch isWaterResistant is:"+isWaterResistant);
	}
	
	public SmartWatch(String name,float price,String color,int size,boolean isWaterResistant,float rating)
	{
		this.name = name;
		this.price = price;
		this.color = color;
		this.size = size;
		this.isWaterResistant = isWaterResistant;
		this.rating = rating;
		System.out.println("------------------------------");
		System.out.println("6 argument constructor");
		System.out.println("The SmartWatch name is:"+name);
		System.out.println("The SmartWatch price is:"+price);
		System.out.println("The SmartWatch color is:"+color);
		System.out.println("The SmartWatch size is:"+size);
		System.out.println("The SmartWatch isWaterResistant is:"+isWaterResistant);
		System.out.println("The SmartWatch rating is:"+rating);
	}
}