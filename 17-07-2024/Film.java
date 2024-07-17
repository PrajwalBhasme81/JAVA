public class Film
{
	public String filmName;
	public short numberOfMainRole;
	public int releasedYear;
	public float rating;
	public String[] languages;
	
	public Film(String filmName,short numberOfMainRole,int releasedYear,float rating,String[] languages)
	{
		this.filmName = filmName;
		this.numberOfMainRole = numberOfMainRole;
		this.releasedYear = releasedYear;
		this.rating = rating;
		this.languages = languages;
		
		System.out.println("The Film Name is:"+filmName);
		System.out.println("The Number Of Main Role is:"+numberOfMainRole);
		System.out.println("The Released Year:"+releasedYear);
		System.out.println("The Rating is :"+rating);
		System.out.println("----------------------------------------------");
	}
}