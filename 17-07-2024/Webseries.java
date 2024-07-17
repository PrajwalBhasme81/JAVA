public class Webseries
{
	public String name;
	public short totalSeasons;
	public int totalEpisodes;
	public float rating;
	public String[] languages;
	
	public Webseries(String name,short totalSeasons,int totalEpisodes,float rating,String[] languages)
	{
		this.name = name;
		this.totalSeasons = totalSeasons;
		this.totalEpisodes = totalEpisodes;
		this.rating = rating;
		this.languages = languages;
		
		System.out.println("The Webseries Name is:"+name);
		System.out.println("The Total Seasons are:"+totalSeasons);
		System.out.println("The Total Episodes are:"+totalEpisodes);
		System.out.println("The Webseries Rating is:"+rating);
		System.out.println("------------------------------");
		
	}
}