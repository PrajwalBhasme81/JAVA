public class NationRunner
{
	public static void main(String args[])
	{
		String languages[] = {"Kannada","Hindi","Tamil"};
		
		for(int i = 0; i < languages.length; i++)
		{
			System.out.println("The Languager are:"+languages[i]);
		}
		Nation country1 = new Nation("INDIA",(short)28,195,142.8f,languages);
		
		for(int i = 0; i < languages.length; i++)
		{
			System.out.println("The Languager are:"+languages[i]);
		}
		Nation country2 = new Nation("INDIA",(short)28,195,142.8f,languages);
		
		for(int i = 0; i < languages.length; i++)
		{
			System.out.println("The Languager are:"+languages[i]);
		}
		Nation country3 = new Nation("INDIA",(short)28,195,142.8f,languages);
		
		for(int i = 0; i < languages.length; i++)
		{
			System.out.println("The Languager are:"+languages[i]);
		}
		Nation country4 = new Nation("INDIA",(short)28,195,142.8f,languages);
	}
}