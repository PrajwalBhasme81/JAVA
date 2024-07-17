public class FilmRunner
{
	public static void main(String args[])
	{
		String languages[] = {"Kannada","Hindi","Tamil","Telagu","Malayalam"};
		
		for(int i = 0; i < languages.length; i++)
		{
			System.out.println("The Languager are:"+languages[i]);
		}
		Entertainment channel1 = new Entertainment("MAX",(short)25,2024,8.5f,languages);
		
		for(int i = 0; i < languages.length; i++)
		{
			System.out.println("The Languager are:"+languages[i]);
		}
		Entertainment channel2 = new Entertainment("MAX",(short)25,2024,8.5f,languages);
		
		for(int i = 0; i < languages.length; i++)
		{
			System.out.println("The Languager are:"+languages[i]);
		}
		Entertainment channel3 = new Entertainment("MAX",(short)25,2024,8.5f,languages);
		
		for(int i = 0; i < languages.length; i++)
		{
			System.out.println("The Languager are:"+languages[i]);
		}
		Entertainment channel4 = new Entertainment("MAX",(short)25,2024,8.5f,languages);
	}
}