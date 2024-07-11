public class BrowserRunner
{
	public static void main(String args[])
	{
		Browser.Search();
		Browser.Search("Search Engine", 10);
		Browser.Search(4.1f);
		String features[] = {"Fast To Search","Simple Interface","Night Mode","Less Data Used"};
		Browser.Search(features);
	}
}