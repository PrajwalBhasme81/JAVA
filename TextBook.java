public class TextBook
{
	static String textBookName;
	static String author;
	static String subject;
	static int releasedYear;
	static float price;
	static boolean published;
	static int numberOfPages;
	static int numberOfChapters;
	static int numberOfModules;
	static int edition;
	
	public static void book()
	{
		textBookName = "Math-Magic";
		author = "Ramanujan";
		subject = "Mathematics";
		releasedYear = 2012;
		price = 500f;
		published = true;
		numberOfPages = 292;
		numberOfChapters = 10;
		numberOfModules = 4;
		edition = 7;
		
		System.out.println("The TextBook Name is:"+textBookName);
		System.out.println("The TextBook Author Name is:"+author);
		System.out.println("The TextBook Subject is:"+subject);
		System.out.println("The TextBook Released Year is:"+releasedYear);
		System.out.println("The TextBook Price is:"+price);
		System.out.println("The TextBook is Published:"+published);
		System.out.println("The TextBook Number of Pages is:"+numberOfPages);
		System.out.println("The TextBook Number of Chapters is:"+numberOfChapters);
		System.out.println("The TextBook Number of Modules is:"+numberOfModules);
		System.out.println("The TextBook Edition is:"+edition);
		
	}
}
		
		