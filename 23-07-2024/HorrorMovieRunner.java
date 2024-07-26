public class HorrorMovieRunner
{
    public static void main(String args[])
    {
        HorrorMovie movie = new HorrorMovie();
        HorrorMovie movie1 = new HorrorMovie("Inception", "Christopher Nolan", 148, 8.8f, "Science Fiction", 2010, 4, "Warner Bros", 5, 5678);
        
        movie1.getMovieTitle("Inception");
        movie1.getRating(8.8f);
        movie1.getGenre("Science Fiction");
        movie1.getMovieID(5678);
    }
}
