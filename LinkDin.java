public class LinkDin
{
	public static void profileDetails()
	{
		System.out.println("Displaying Profile Details");
		LinkDin.educationDetails();
	}
	
	public static void educationDetails()
	{
		System.out.println("Displaying Education Details");
		LinkDin.personalDetails();
	}
	
	public static void personalDetails()
	{
		System.out.println("Displaying Personal Details");
		LinkDin.skills();
	}
	
	public static void skills()
	{
		System.out.println("Displaying Skills");
		LinkDin.percentageOfDegree();
	}
	
	public static void percentageOfDegree()
	{
		System.out.println("Displaying Percentage Of Degree");
		LinkDin.profileDetails();
	}
	
	public static void main(String[] args)
	{
		LinkDin.profileDetails();
	}
}
	