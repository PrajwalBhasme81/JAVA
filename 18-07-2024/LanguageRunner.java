public class LanguageRunner
{
	public static void main(String args[])
	{
		String countries_spoken[] = {"Spain", "Mexico", "Colombia", "Argentina"};
		
		Language language = new Language();
		
		Language language1 = new Language("Spanish");
		
		Language language2 = new Language("Spanish",460000000);
		
		Language language3 = new Language("Spanish",460000000,true);
		
		Language language4 = new Language("Spanish",460000000,true,"Indo-European");
		
		Language language5 = new Language("Spanish",460000000,true,"Indo-European","Latin");
		
		Language language6 = new Language("Spanish",460000000,true,"Indo-European","Latin",false);
		
		Language language7 = new Language("Spanish",460000000,true,"Indo-European","Latin",false,27);
		
		Language language8 = new Language("Spanish",460000000,true,"Indo-European","Latin",false,27,"9th century");
		
		Language language9 = new Language("Spanish",460000000,true,"Indo-European","Latin",false,27,"9th century","Medium");
		
		Language language10 = new Language("Spanish",460000000,true,"Indo-European","Latin",false,27,"9th century","Medium",countries_spoken);
		
		for(int i = 0; i < countries_spoken.length; i++)
		{
			System.out.println("The countries_spoken are:"+countries_spoken[i]);
		}
	}
}
		
		
