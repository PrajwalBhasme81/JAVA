public class Vehicle
{
	public String type;         
    public String brand;    
    public String model;          
    public float engine_capacity;      
    public boolean is_two_wheeler;    
    public float price;            
    public int year;                
    public String color;             
    public String fuel_type;         
    public float top_speed;

	public Vehicle()
	{
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 0 Arguments");
	}
	
	public Vehicle(String type)
	{
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 1 Arguments");
		System.out.println("The Vehicle type is:"+type);
	}
	
	public Vehicle(String type,String brand)
	{
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 1 Arguments");
		System.out.println("The Vehicle type is:"+type);
		System.out.println("The Vehicle brand is:"+brand);
	}

	public Vehicle(String type,String brand,String model)
	{
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 1 Arguments");
		System.out.println("The Vehicle type is:"+type);
		System.out.println("The Vehicle brand is:"+brand);
		System.out.println("The Vehicle model is:"+model);
	}
	
	public Vehicle(String type,String brand,String model,float engine_capacity)
	{
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 1 Arguments");
		System.out.println("The Vehicle type is:"+type);
		System.out.println("The Vehicle brand is:"+brand);
		System.out.println("The Vehicle model is:"+model);
		System.out.println("The Vehicle engine_capacity is:"+engine_capacity);
	}
	
	public Vehicle(String type,String brand,String model,float engine_capacity,boolean is_two_wheeler)
	{
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 1 Arguments");
		System.out.println("The Vehicle type is:"+type);
		System.out.println("The Vehicle brand is:"+brand);
		System.out.println("The Vehicle model is:"+model);
		System.out.println("The Vehicle engine_capacity is:"+engine_capacity);
		System.out.println("The Vehicle is_two_wheeler is:"+is_two_wheeler);
	}
	
	public Vehicle(String type,String brand,String model,float engine_capacity,boolean is_two_wheeler,float price)
	{
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 1 Arguments");
		System.out.println("The Vehicle type is:"+type);
		System.out.println("The Vehicle brand is:"+brand);
		System.out.println("The Vehicle model is:"+model);
		System.out.println("The Vehicle engine_capacity is:"+engine_capacity);
		System.out.println("The Vehicle is_two_wheeler is:"+is_two_wheeler);
		System.out.println("The Vehicle price is:"+price);
	}
	
	public Vehicle(String type,String brand,String model,float engine_capacity,boolean is_two_wheeler,float price,int year)
	{
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 1 Arguments");
		System.out.println("The Vehicle type is:"+type);
		System.out.println("The Vehicle brand is:"+brand);
		System.out.println("The Vehicle model is:"+model);
		System.out.println("The Vehicle engine_capacity is:"+engine_capacity);
		System.out.println("The Vehicle is_two_wheeler is:"+is_two_wheeler);
		System.out.println("The Vehicle price is:"+price);
		System.out.println("The Vehicle year is:"+year);
	}
	
	public Vehicle(String type,String brand,String model,float engine_capacity,boolean is_two_wheeler,float price,int year,String color)
	{
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 1 Arguments");
		System.out.println("The Vehicle type is:"+type);
		System.out.println("The Vehicle brand is:"+brand);
		System.out.println("The Vehicle model is:"+model);
		System.out.println("The Vehicle engine_capacity is:"+engine_capacity);
		System.out.println("The Vehicle is_two_wheeler is:"+is_two_wheeler);
		System.out.println("The Vehicle price is:"+price);
		System.out.println("The Vehicle year is:"+year);
		System.out.println("The Vehicle color is:"+color);
	}
	
	public Vehicle(String type,String brand,String model,float engine_capacity,boolean is_two_wheeler,float price,int year,String color,String fuel_type)
	{
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 1 Arguments");
		System.out.println("The Vehicle type is:"+type);
		System.out.println("The Vehicle brand is:"+brand);
		System.out.println("The Vehicle model is:"+model);
		System.out.println("The Vehicle engine_capacity is:"+engine_capacity);
		System.out.println("The Vehicle is_two_wheeler is:"+is_two_wheeler);
		System.out.println("The Vehicle price is:"+price);
		System.out.println("The Vehicle year is:"+year);
		System.out.println("The Vehicle color is:"+color);
		System.out.println("The Vehicle fuel_type is:"+fuel_type);
	}
	
	public Vehicle(String type,String brand,String model,float engine_capacity,boolean is_two_wheeler,float price,int year,String color,String fuel_type,float top_speed)
	{
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 1 Arguments");
		System.out.println("The Vehicle type is:"+type);
		System.out.println("The Vehicle brand is:"+brand);
		System.out.println("The Vehicle model is:"+model);
		System.out.println("The Vehicle engine_capacity is:"+engine_capacity);
		System.out.println("The Vehicle is_two_wheeler is:"+is_two_wheeler);
		System.out.println("The Vehicle price is:"+price);
		System.out.println("The Vehicle year is:"+year);
		System.out.println("The Vehicle color is:"+color);
		System.out.println("The Vehicle fuel_type is:"+fuel_type);
		System.out.println("The Vehicle top_speed is:"+top_speed);
	}
}