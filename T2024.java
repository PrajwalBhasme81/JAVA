public class T2024 
{
    public static void Score() 
	{
        int score = 210;
		int lowScore = 49;
		int highScore = 200;

        if (score > highScore) 
		{
            System.out.println("High score is: " + score);
        }
		if (score < lowScore) 
		{
            System.out.println("Score is not less than Low Score");
        }
		if (score == 210)
		{
            System.out.println("Score is equal to :"+score);
        }
		if (lowScore == 49)
		{
			System.out.println("Low Score is :"+lowScore);
		}
		if (highScore == 200)
		{
			System.out.println("High Score is :"+highScore);
		}
    }

    public static void Wickets() 
	{
        int wickets = 8;
		int lowestWicket = 0;
		int highestWicket = 10;

        if (wickets > highestWicket) 
		{
            System.out.println("Highest wickets is: " + wickets);
        }
		if (wickets < lowestWicket) 
		{
            System.out.println("Wickets is not less than Lowest Wicket");
        }
		if (wickets == 8)
		{
            System.out.println("Wickets is equal to :"+wickets);
        }
		if (lowestWicket == 0)
		{
			System.out.println("Lowest Wicket is :"+lowestWicket);
		}
		if (highestWicket == 10)
		{
			System.out.println("Highest Wicket is :"+highestWicket);
		}
    }

     public static void Matchrating() 
	{
        int ratings = 7;
		int lowestrating = 0;
		int highestrating = 10;

        if (ratings > highestrating) 
		{
            System.out.println("Highest rating is: " + ratings);
        }
		if (ratings < lowestrating) 
		{
            System.out.println("Ratings is not less than Lowest rating");
        }
		if (ratings == 7)
		{
            System.out.println("Ratings is equal to :"+ratings);
        }
		if (lowestrating == 0)
		{
			System.out.println("Lowest rating is :"+lowestrating);
		}
		if (highestrating == 10)
		{
			System.out.println("Highest rating is :"+highestrating);
		}
    }
}
