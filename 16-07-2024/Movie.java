public class Movie 
{
    public Movie() 
	{
        System.out.println("Displaying Movie Details");
    }

    public String movieID;
	public String movieName;
    public String title;
    public String genre;
    public String director;
    public String language;
    public int releaseYear;
    public double imdbRating;
    public int durationMinutes;
    public String synopsis;
    public String mainActor;
    public String mainActress;
    public boolean isBlockbuster;

    public static int totalMovies = 500;
    public static double averageRating = 7.5;
    public static int totalGenres = 20;
    public static int totalDirectors = 100;
    public static double highestRating = 9.5;
    public static double lowestRating = 5.0;
	public static int totalBlockBlasterMovies = 420;
	public static int totalActionMovies = 298;
	public static int totalTrillerMovies = 178;
	public static double graphicRating = 9.6;
	public static int totalEmotionalMovies = 150;
	public static int totalFlopMovies = 70;
	public static double movieClarity = 9.7;
}

