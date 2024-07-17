public class LibraryBook 
{
    public LibraryBook() 
	{
        System.out.println("Displaying Library Book Details");
    }
    
    public String title;
    public String author;
    public String isbn;
    public int publicationYear;
    public String genre;
    public boolean isAvailable;
    public String borrower;
    public String dueDate;
    public int pages;
    public String publisher;
    public String language;
    public boolean isDigital;
    public String format;
    public double price;

    public static int totalBooks = 5000;
    public static int availableBooks = 4000;
    public static int borrowedBooks = 1000;
    public static double totalValue = 100000.0;
    public static int totalPages = 150000;
    public static int totalAuthors = 500;
    public static int totalGenres = 20;
    public static int totalLanguages = 30;
    public static int digitalBooks = 1000;
    public static int physicalBooks = 4000;
    public static double averagePrice = 20;
    public static int totalPublishers = 50;
    public static int totalSections = 10;
}
