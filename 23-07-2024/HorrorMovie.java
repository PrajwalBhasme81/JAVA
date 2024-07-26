public class HorrorMovie
{
    public String title;
    public String director;
    public int duration;
    public float rating;
    public String genre;
    public int releaseYear;
    public int numOfAwards;
    public String productionCompany;
    public int numOfLanguages;
    public int movieID;
    
    public HorrorMovie()
    {
        System.out.println("-------------------------------");
        System.out.println("This is the No-Argument constructor");
    }
    
    public HorrorMovie(String title, String director, int duration, float rating, String genre, int releaseYear, int numOfAwards, String productionCompany, int numOfLanguages, int movieID)
    {
        this.title = title;
        this.director = director;
        this.duration = duration;
        this.rating = rating;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.numOfAwards = numOfAwards;
        this.productionCompany = productionCompany;
        this.numOfLanguages = numOfLanguages;
        this.movieID = movieID;
        System.out.println("-------------------------------");
        System.out.println("This is the All-Argument constructor");
        System.out.println("The Movie Title is: " + title);
        System.out.println("The Movie Director is: " + director);
        System.out.println("The Movie Duration is: " + duration + " minutes");
        System.out.println("The Movie Rating is: " + rating);
        System.out.println("The Movie Genre is: " + genre);
        System.out.println("The Movie Release Year is: " + releaseYear);
        System.out.println("The Number of Awards is: " + numOfAwards);
        System.out.println("The Production Company is: " + productionCompany);
        System.out.println("The Number of Languages is: " + numOfLanguages);
        System.out.println("The Movie ID is: " + movieID);
        System.out.println("-------------------------------");
    }
    
    public void getMovieTitle(String title)
    {
        System.out.println("The Movie Title is: " + title);
        System.out.println("-------------------------------");
    }
    
    public void getRating(float rating)
    {
        System.out.println("The Movie Rating is: " + rating);
        System.out.println("-------------------------------");
    }
    
    public String getGenre(String genre)
    {
        System.out.println("The Movie Genre is: " + genre);
        System.out.println("-------------------------------");
        return "genre";
    }
    
    public int getMovieID(int movieID)
    {
        System.out.println("The Movie ID is: " + movieID);
        System.out.println("-------------------------------");
        return 0;
    }
}
