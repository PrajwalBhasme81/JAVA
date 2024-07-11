public class JioCinemaRunner
{
	public static void main(String args[])
	{
		JioCinema.Ott();
		JioCinema.Ott("OTT App", 37);
		JioCinema.Ott(3.6f);
		String categories[] = {"Movies","Tv Shows","Sports","WebSeries"};
		JioCinema.Ott(categories);
	}
}