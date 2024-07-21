public class TShirts
{
	public String type;
	public String color;
	public boolean isFit;
	public boolean isOversize;
	public int numOfCollections;
	public int size;
	
	public TShirts(String type)
	{
		this("Round Neck","Black");
		System.out.println("------------------------------");
		this.type = type;
		System.out.println("The TShirt type is:"+type);
		System.out.println("------------------------------");
	}
	
	public TShirts(String type,String color)
	{
		this("Round Neck","Black",true,false);
		System.out.println("------------------------------");
		this.type = type;
		this.color = color;
		System.out.println("The TShirt type is:"+type);
		System.out.println("The TShirt region is:"+color);
	}
	
	public TShirts(String type,String color,boolean isFit,boolean isOversize)
	{
		this("Round Neck","Black",true,false,44000);
		System.out.println("------------------------------");
		this.type = type;
		this.color = color;
		this.isFit = isFit;
		this.isOversize = isOversize;
		System.out.println("The TShirt Name is:"+type);
		System.out.println("The TShirt region is:"+color);
		System.out.println("The TShirt isFit:"+isFit);
		System.out.println("The TShirt isOversize:"+isOversize);
	}
	
	public TShirts(String type,String color,boolean isFit,boolean isOversize,int numOfCollections)
	{
		this("Round Neck","Black",true,false,44000,32);
		System.out.println("------------------------------");
		this.type = type;
		this.color = color;
		this.isFit = isFit;
		this.isOversize = isOversize;
		this.numOfCollections = numOfCollections;
		System.out.println("The TShirt Name is:"+type);
		System.out.println("The TShirt region is:"+color);
		System.out.println("The TShirt isFit:"+isFit);
		System.out.println("The TShirt isOversize:"+isOversize);
		System.out.println("The TShirt numOfCollections:"+numOfCollections);
	}
	
	public TShirts(String type,String color,boolean isFit,boolean isOversize,int numOfCollections,int size)
	{
		System.out.println("------------------------------");
		this.type = type;
		this.color = color;
		this.isFit = isFit;
		this.isOversize = isOversize;
		this.numOfCollections = numOfCollections;
		this.size = size;
		System.out.println("The TShirt Name is:"+type);
		System.out.println("The TShirt region is:"+color);
		System.out.println("The TShirt isFit:"+isFit);
		System.out.println("The TShirt isOversize:"+isOversize);
		System.out.println("The TShirt numOfCollections:"+numOfCollections);
		System.out.println("The TShirt OriginYear:"+size+"CE");
	}
}
