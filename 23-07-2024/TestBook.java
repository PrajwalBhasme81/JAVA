public class TestBook
{
	public String name;
	public String author;
	public int pages;
	public float price;
	public String languages;
	public int publicationYear;
	public int numOfChapters;
	public String publisher;
	public int numOfLanguages;
	public int bookNum;
	
	public TestBook()
	{
		System.out.println("-------------------------------");
		System.out.println("This is the No-Argument constructor");
	}
	
	public TestBook(String name,String author,int pages,float price,String languages,int publicationYear,int numOfChapters,String publisher,int numOfLanguages,int bookNum)
	{
		this.name = name;
		this.author = author;
		this.pages = pages;
		this.price = price;
		this.languages = languages;
		this.publicationYear = publicationYear;
		this.numOfChapters = numOfChapters;
		this.publisher = publisher;
		this.numOfLanguages = numOfLanguages;
		this.bookNum = bookNum;
		System.out.println("-------------------------------");
		System.out.println("This is the All-Argument constructor");
		System.out.println("The Book Name is:"+name);
		System.out.println("The Book Author is:"+author);
		System.out.println("The Total Book Pages are:"+pages);
		System.out.println("The Book price is:"+price);
		System.out.println("The Book languages is:"+languages);
		System.out.println("The Book publicationYear is:"+publicationYear);
		System.out.println("The Book numOfChapters is:"+numOfChapters);
		System.out.println("The Book publisher is:"+publisher);
		System.out.println("The NumOfLanguages are:"+numOfLanguages);
		System.out.println("The Book Number is:"+bookNum);
		System.out.println("-------------------------------");
	}
	
	public void getBookName(String name)
	{
		System.out.println("The Book Name is:"+name);
		System.out.println("-------------------------------");
	}
	
	public void getPrice(float price)
	{
		System.out.println("The Book price is:"+price);
		System.out.println("-------------------------------");
	}
	
	public String getLanguage(String languages)
	{
		System.out.println("The Book languages is:"+languages);
		System.out.println("-------------------------------");
		return "languages";
	}
	
	public int getBookNumber(int bookNum)
	{
		System.out.println("The Book Number is:"+bookNum);
		System.out.println("-------------------------------");
		return 0;
	}
}
		
		
		
		
		