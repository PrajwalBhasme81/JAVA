public class Mountain
{
	public String name;
    public float height;
    public String location;
    public int first_ascent_year;
    public boolean is_climbable;
    public String range;
    public String difficulty_level;
    public float average_temperature;
    public int annual_climbers; 
	public String[] first_ascenders;
	
	public Mountain()
	{
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 0 Arguments");
	}
	
	public Mountain(String name)
	{
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 1 Arguments");
		System.out.println("The Mountain name is:"+name);
	}
	
	public Mountain(String name,float height)
	{
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 2 Arguments");
		System.out.println("The Mountain name is:"+name);
		System.out.println("The Mountain height is:"+height);
	}
	
	public Mountain(String name,float height,String location)
	{
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 3 Arguments");
		System.out.println("The Mountain name is:"+name);
		System.out.println("The Mountain height is:"+height);
		System.out.println("The Mountain location is:"+location);
	}
	
	public Mountain(String name,float height,String location,int first_ascent_year)
	{
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 4 Arguments");
		System.out.println("The Mountain name is:"+name);
		System.out.println("The Mountain height is:"+height);
		System.out.println("The Mountain first_ascent_year is:"+first_ascent_year);
	}
	
	public Mountain(String name,float height,String location,int first_ascent_year,boolean is_climbable)
	{
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 5 Arguments");
		System.out.println("The Mountain name is:"+name);
		System.out.println("The Mountain height is:"+height);
		System.out.println("The Mountain is_climbable is:"+is_climbable);
	}
	
	public Mountain(String name,float height,String location,int first_ascent_year,boolean is_climbable,String range)
	{
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 6 Arguments");
		System.out.println("The Mountain name is:"+name);
		System.out.println("The Mountain height is:"+height);
		System.out.println("The Mountain is_climbable is:"+is_climbable);
		System.out.println("The Mountain range is:"+range);
	}
	
	public Mountain(String name,float height,String location,int first_ascent_year,boolean is_climbable,String range,String difficulty_level)
	{
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 7 Arguments");
		System.out.println("The Mountain name is:"+name);
		System.out.println("The Mountain height is:"+height);
		System.out.println("The Mountain is_climbable is:"+is_climbable);
		System.out.println("The Mountain range is:"+range);
		System.out.println("The Mountain difficulty_level is:"+difficulty_level);
	}
	
	public Mountain(String name,float height,String location,int first_ascent_year,boolean is_climbable,String range,String difficulty_level,float average_temperature)
	{
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 8 Arguments");
		System.out.println("The Mountain name is:"+name);
		System.out.println("The Mountain height is:"+height);
		System.out.println("The Mountain is_climbable is:"+is_climbable);
		System.out.println("The Mountain range is:"+range);
		System.out.println("The Mountain average_temperature is:"+average_temperature);
	}
	
	public Mountain(String name,float height,String location,int first_ascent_year,boolean is_climbable,String range,String difficulty_level,float average_temperature,int annual_climbers)
	{
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 9 Arguments");
		System.out.println("The Mountain name is:"+name);
		System.out.println("The Mountain height is:"+height);
		System.out.println("The Mountain is_climbable is:"+is_climbable);
		System.out.println("The Mountain range is:"+range);
		System.out.println("The Mountain average_temperature is:"+average_temperature);
		System.out.println("The Mountain annual_climbers is:"+annual_climbers);
	}
	
	public Mountain(String name,float height,String location,int first_ascent_year,boolean is_climbable,String range,String difficulty_level,float average_temperature,int annual_climbers,String[] first_ascenders)
	{
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 10 Arguments");
		System.out.println("The Mountain name is:"+name);
		System.out.println("The Mountain height is:"+height);
		System.out.println("The Mountain is_climbable is:"+is_climbable);
		System.out.println("The Mountain range is:"+range);
		System.out.println("The Mountain average_temperature is:"+average_temperature);
		System.out.println("The Mountain annual_climbers is:"+annual_climbers);
		System.out.println("The Mountain first_ascenders is:"+first_ascenders);
	}
}