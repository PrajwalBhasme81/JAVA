public class PC
{
	public String brand;             
    public String model;       
    public String processor;
    public int ram;                 
    public float storage;              
    public boolean is_gaming;       
    public float price;          
    public String os;        
    public int release_year;       
    public String[] ports; 
	
	public PC()
	{
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 0 Arguments");
	}
	
	public PC(String brand)
	{
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 1 Arguments");
		System.out.println("The PC brand is:"+brand);
	}
	
	public PC(String brand,String model)
	{
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 2 Arguments");
		System.out.println("The PC brand is:"+brand);
		System.out.println("The PC model is:"+model);
	}
	
	public PC(String brand,String model,String processor)
	{
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 3 Arguments");
		System.out.println("The PC brand is:"+brand);
		System.out.println("The PC model is:"+model);
		System.out.println("The PC processor is:"+processor);
	}
	
	public PC(String brand,String model,String processor,int ram)
	{
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 4 Arguments");
		System.out.println("The PC brand is:"+brand);
		System.out.println("The PC model is:"+model);
		System.out.println("The PC processor is:"+processor);
		System.out.println("The PC ram is:"+ram);
	}
	
	public PC(String brand,String model,String processor,int ram,float storage)
	{
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 5 Arguments");
		System.out.println("The PC brand is:"+brand);
		System.out.println("The PC model is:"+model);
		System.out.println("The PC processor is:"+processor);
		System.out.println("The PC ram is:"+ram);
		System.out.println("The PC storage is:"+storage);
	}
	
	public PC(String brand,String model,String processor,int ram,float storage,boolean is_gaming)
	{
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 6 Arguments");
		System.out.println("The PC brand is:"+brand);
		System.out.println("The PC model is:"+model);
		System.out.println("The PC processor is:"+processor);
		System.out.println("The PC ram is:"+ram);
		System.out.println("The PC storage is:"+storage);
		System.out.println("The PC is_gaming is:"+is_gaming);
	}
	
	public PC(String brand,String model,String processor,int ram,float storage,boolean is_gaming,float price)
	{
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 7 Arguments");
		System.out.println("The PC brand is:"+brand);
		System.out.println("The PC model is:"+model);
		System.out.println("The PC processor is:"+processor);
		System.out.println("The PC ram is:"+ram);
		System.out.println("The PC storage is:"+storage);
		System.out.println("The PC is_gaming is:"+is_gaming);
		System.out.println("The PC price is:"+price);
	}
	
	public PC(String brand,String model,String processor,int ram,float storage,boolean is_gaming,float price,String os)
	{
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 8 Arguments");
		System.out.println("The PC brand is:"+brand);
		System.out.println("The PC model is:"+model);
		System.out.println("The PC processor is:"+processor);
		System.out.println("The PC ram is:"+ram);
		System.out.println("The PC storage is:"+storage);
		System.out.println("The PC is_gaming is:"+is_gaming);
		System.out.println("The PC price is:"+price);
		System.out.println("The PC os is:"+os);
	}
	
	public PC(String brand,String model,String processor,int ram,float storage,boolean is_gaming,float price,String os,int release_year)
	{
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 9 Arguments");
		System.out.println("The PC brand is:"+brand);
		System.out.println("The PC model is:"+model);
		System.out.println("The PC processor is:"+processor);
		System.out.println("The PC ram is:"+ram);
		System.out.println("The PC storage is:"+storage);
		System.out.println("The PC is_gaming is:"+is_gaming);
		System.out.println("The PC price is:"+price);
		System.out.println("The PC os is:"+os);
		System.out.println("The PC release_year is:"+release_year);
	}
	
	public PC(String brand,String model,String processor,int ram,float storage,boolean is_gaming,float price,String os,int release_year,String[] ports)
	{
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 10 Arguments");
		System.out.println("The PC brand is:"+brand);
		System.out.println("The PC model is:"+model);
		System.out.println("The PC processor is:"+processor);
		System.out.println("The PC ram is:"+ram);
		System.out.println("The PC storage is:"+storage);
		System.out.println("The PC is_gaming is:"+is_gaming);
		System.out.println("The PC price is:"+price);
		System.out.println("The PC os is:"+os);
		System.out.println("The PC release_year is:"+release_year);
		System.out.println("The PC ports is:"+ports);
	}
}