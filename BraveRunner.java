public class BraveRunner
{
	public static void main(String args[])
	{
		Brave.Search();
		Brave.Search("Search Engine", 85);
		Brave.Search(4.5f);
		String features[] = {"Ad-Free","Full Privacy","Battery Saving","Less Data Used"};
		Brave.Search(features);
	}
}