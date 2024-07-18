public class Language
{
   public String name;       
   public int speakers;
   public boolean is_official;
   public String family;
   public String script;
   public boolean is_written; 
   public int alphabets;
   public String first_record;
   public String difficulty_level;
   public String[] countries_spoken;
   
   public Language()
	{
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 0 Arguments");
	}
	
	public Language(String name)
	{
		this.name = name;
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 1 Arguments");
		System.out.println("The Language name is:"+name);
	}
	
	public Language(String name,int speakers)
	{
		this.name = name;
		this.speakers = speakers;
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 2 Arguments");
		System.out.println("The Language name is:"+name);
		System.out.println("The Language speakers is:"+speakers);
	}
	
	public Language(String name,int speakers,boolean is_official)
	{
		this.name = name;
		this.speakers = speakers;
		this.is_official = is_official;
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 3 Arguments");
		System.out.println("The Language name is:"+name);
		System.out.println("The Language speakers is:"+speakers);
		System.out.println("The Language is_official is:"+is_official);
	}
	
	public Language(String name,int speakers,boolean is_official,String family)
	{
		this.name = name;
		this.speakers = speakers;
		this.is_official = is_official;
		this.family = family;
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 4 Arguments");
		System.out.println("The Language name is:"+name);
		System.out.println("The Language speakers is:"+speakers);
		System.out.println("The Language is_official is:"+is_official);
		System.out.println("The Language family is:"+family);
	}
	
	public Language(String name,int speakers,boolean is_official,String family,String script)
	{
		this.name = name;
		this.speakers = speakers;
		this.is_official = is_official;
		this.family = family;
		this.script = script;
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 5 Arguments");
		System.out.println("The Language name is:"+name);
		System.out.println("The Language speakers is:"+speakers);
		System.out.println("The Language is_official is:"+is_official);
		System.out.println("The Language family is:"+family);
		System.out.println("The Language script is:"+script);
	}
	
	public Language(String name,int speakers,boolean is_official,String family,String script,boolean is_written)
	{
		this.name = name;
		this.speakers = speakers;
		this.is_official = is_official;
		this.family = family;
		this.script = script;
		this.is_written = is_written;
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 6 Arguments");
		System.out.println("The Language name is:"+name);
		System.out.println("The Language speakers is:"+speakers);
		System.out.println("The Language is_official is:"+is_official);
		System.out.println("The Language family is:"+family);
		System.out.println("The Language script is:"+script);
		System.out.println("The Language is_written is:"+is_written);
	}
	
	public Language(String name,int speakers,boolean is_official,String family,String script,boolean is_written,int alphabets)
	{
		this.name = name;
		this.speakers = speakers;
		this.is_official = is_official;
		this.family = family;
		this.script = script;
		this.is_written = is_written;
		this.alphabets = alphabets;
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 7 Arguments");
		System.out.println("The Language name is:"+name);
		System.out.println("The Language speakers is:"+speakers);
		System.out.println("The Language is_official is:"+is_official);
		System.out.println("The Language family is:"+family);
		System.out.println("The Language script is:"+script);
		System.out.println("The Language is_written is:"+is_written);
		System.out.println("The Language alphabets is:"+alphabets);
	}
	
	public Language(String name,int speakers,boolean is_official,String family,String script,boolean is_written,int alphabets,String first_record)
	{
		this.name = name;
		this.speakers = speakers;
		this.is_official = is_official;
		this.family = family;
		this.script = script;
		this.is_written = is_written;
		this.alphabets = alphabets;
		this.first_record = first_record;
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 8 Arguments");
		System.out.println("The Language name is:"+name);
		System.out.println("The Language speakers is:"+speakers);
		System.out.println("The Language is_official is:"+is_official);
		System.out.println("The Language family is:"+family);
		System.out.println("The Language script is:"+script);
		System.out.println("The Language is_written is:"+is_written);
		System.out.println("The Language alphabets is:"+alphabets);
		System.out.println("The Language first_record is:"+first_record);
	}
	
	public Language(String name,int speakers,boolean is_official,String family,String script,boolean is_written,int alphabets,String first_record,String difficulty_level)
	{
		this.name = name;
		this.speakers = speakers;
		this.is_official = is_official;
		this.family = family;
		this.script = script;
		this.is_written = is_written;
		this.alphabets = alphabets;
		this.first_record = first_record;
		this.difficulty_level = difficulty_level;
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 9 Arguments");
		System.out.println("The Language name is:"+name);
		System.out.println("The Language speakers is:"+speakers);
		System.out.println("The Language is_official is:"+is_official);
		System.out.println("The Language family is:"+family);
		System.out.println("The Language script is:"+script);
		System.out.println("The Language is_written is:"+is_written);
		System.out.println("The Language alphabets is:"+alphabets);
		System.out.println("The Language first_record is:"+first_record);
		System.out.println("The Language difficulty_level is:"+difficulty_level);
	}
	
	public Language(String name,int speakers,boolean is_official,String family,String script,boolean is_written,int alphabets,String first_record,String difficulty_level,String[] countries_spoken)
	{
		this.name = name;
		this.speakers = speakers;
		this.is_official = is_official;
		this.family = family;
		this.script = script;
		this.is_written = is_written;
		this.alphabets = alphabets;
		this.first_record = first_record;
		this.difficulty_level = difficulty_level;
		this.countries_spoken = countries_spoken;
		System.out.println("---------------------------------------");
		System.out.println("Constructor with 10 Arguments");
		System.out.println("The Language name is:"+name);
		System.out.println("The Language speakers is:"+speakers);
		System.out.println("The Language is_official is:"+is_official);
		System.out.println("The Language family is:"+family);
		System.out.println("The Language script is:"+script);
		System.out.println("The Language is_written is:"+is_written);
		System.out.println("The Language alphabets is:"+alphabets);
		System.out.println("The Language first_record is:"+first_record);
		System.out.println("The Language difficulty_level is:"+difficulty_level);
	}
}

