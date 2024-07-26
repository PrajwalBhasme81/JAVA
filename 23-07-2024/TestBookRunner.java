public class TestBookRunner
{
	public static void main(String args[])
	{
		TestBook book = new TestBook();
		TestBook book1 = new TestBook("Java","Dr.Kishan",243,599.0f,"English",2023,8,"PB-BookHouse",1,1234);
		
		book1.getBookName("Java");
		book1.getPrice(599.0f);
		book1.getLanguage("English");
		book1.getBookNumber(1234);
	}
}
		