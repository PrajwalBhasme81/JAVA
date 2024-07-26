public class Fish
{
	String fishName;
	String fishColor;
	int lifeSpan;
	
	public void fish(String fishName)
	{
		this.fishName = fishName;
		System.out.println("The Fish Name is:"+fishName);
	}
	
	public void fish(String fishName,String fishColor)
	{
		this.fish("BlueRing Angle Fish");
		this.fishName = fishName;
		this.fishColor = fishColor;
		System.out.println("The Fish Name is:"+fishName);
		System.out.println("The Fish Color is:"+fishColor);
	}
	
	public void fish(String fishName,String fishColor,int lifeSpan)
	{
		this.fish("BlueRing Angle Fish","Blue");
		this.fishName = fishName;
		this.fishColor = fishColor;
		this.lifeSpan = lifeSpan;
		System.out.println("The Fish Name is:"+fishName);
		System.out.println("The Fish Color is:"+fishColor);
		System.out.println("The Fish lifeSpan is:"+lifeSpan);
	}
}
