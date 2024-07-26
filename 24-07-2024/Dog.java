public class Dog
{
	String dogName;
	String dogBreed;
	int dogAge;
	String dogColor;
	
	public Dog(String dogName,String dogBreed)
	{
		this.dogName = dogName;
		this.dogBreed = dogBreed;
		System.out.println("The Dog Name is:"+dogName);
		System.out.println("The Dog Breed is:"+dogBreed);
	}
	
	public Dog(int dogAge,String dogColor)
	{
		this("Charli","German Shepherd");
		this.dogAge = dogAge;
		this.dogColor = dogColor;
		System.out.println("The Dog Age is:"+dogAge);
		System.out.println("The Dog Color is:"+dogColor);
	}
}
	