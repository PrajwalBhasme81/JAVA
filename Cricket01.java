public class Cricket01
{
    public static double calculateRunRate(String playerName, int totalScore, int totalBalls) 
	{
        if (totalBalls == 0) 
		{
            System.out.println("Total balls cannot be zero.");
        }
        double runRate = (double) totalScore / totalBalls * 100;
        System.out.println("Player: " + playerName + " has a run rate of: " + runRate);
		return runRate;
    }
	
	public static boolean matchResult(boolean Result)
	{
		if(Result)
		{
			System.out.println("Won the Match");
		}
		else
		{
			System.out.println("Loose the Match");
		}
		return Result;
	}
	
	public static void displayPlayerDetails(String name, int age, double height, double weight, String education, int numberOfMatches, int totalScore) 
	{
        System.out.println("Player Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " foot");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Education: " + education);
        System.out.println("Number of Matches: " + numberOfMatches);
        System.out.println("Total Score: " + totalScore);
    }

}
