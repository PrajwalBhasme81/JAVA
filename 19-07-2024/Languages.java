public class Languages
{
	public String languageName;
	public String languageRegion;
	public boolean isReadable;
	public boolean isWrightable;
	public long numOfSpeakers;
	public int langOriginYear;
	
	public Languages(String languageName)
	{
		this("Kannada","Karanataka");
		System.out.println("------------------------------");
		this.languageName = languageName;
		System.out.println("The Language Name is:"+languageName);
		System.out.println("------------------------------");
	}
	
	public Languages(String languageName,String languageRegion)
	{
		this("Kannada","Karanataka",true,true);
		System.out.println("------------------------------");
		this.languageName = languageName;
		this.languageRegion = languageRegion;
		System.out.println("The Language Name is:"+languageName);
		System.out.println("The Language region is:"+languageRegion);
	}
	
	public Languages(String languageName,String languageRegion,boolean isReadable,boolean isWrightable)
	{
		this("Kannada","Karanataka",true,true,440000000);
		System.out.println("------------------------------");
		this.languageName = languageName;
		this.languageRegion = languageRegion;
		this.isReadable = isReadable;
		this.isWrightable = isWrightable;
		System.out.println("The Language Name is:"+languageName);
		System.out.println("The Language region is:"+languageRegion);
		System.out.println("The Language isReadable:"+isReadable);
		System.out.println("The Language isWrightable:"+isWrightable);
	}
	
	public Languages(String languageName,String languageRegion,boolean isReadable,boolean isWrightable,long numOfSpeakers)
	{
		this("Kannada","Karanataka",true,true,440000000,450);
		System.out.println("------------------------------");
		this.languageName = languageName;
		this.languageRegion = languageRegion;
		this.isReadable = isReadable;
		this.isWrightable = isWrightable;
		this.numOfSpeakers = numOfSpeakers;
		System.out.println("The Language Name is:"+languageName);
		System.out.println("The Language region is:"+languageRegion);
		System.out.println("The Language isReadable:"+isReadable);
		System.out.println("The Language isWrightable:"+isWrightable);
		System.out.println("The Language numOfSpeakers:"+numOfSpeakers);
	}
	
	public Languages(String languageName,String languageRegion,boolean isReadable,boolean isWrightable,long numOfSpeakers,int langOriginYear)
	{
		System.out.println("------------------------------");
		this.languageName = languageName;
		this.languageRegion = languageRegion;
		this.isReadable = isReadable;
		this.isWrightable = isWrightable;
		this.numOfSpeakers = numOfSpeakers;
		this.langOriginYear = langOriginYear;
		System.out.println("The Language Name is:"+languageName);
		System.out.println("The Language region is:"+languageRegion);
		System.out.println("The Language isReadable:"+isReadable);
		System.out.println("The Language isWrightable:"+isWrightable);
		System.out.println("The Language numOfSpeakers:"+numOfSpeakers);
		System.out.println("The Language OriginYear:"+langOriginYear+"CE");
	}
}
