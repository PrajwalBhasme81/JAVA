public class EntertainmentRunner
{
	public static void main(String args[])
	{
		String languages[] = {"Kannada","Hindi","Tamil"};
		
		for(int i = 0; i < languages.length; i++)
		{
			System.out.println("The Languager are:"+languages[i]);
		}
		Entertainment channel1 = new Entertainment("Comedy",(short)212,151,9.2f,languages);
		
		for(int i = 0; i < languages.length; i++)
		{
			System.out.println("The Languager are:"+languages[i]);
		}
		Entertainment channel2 = new Entertainment("Comedy",(short)212,151,9.2f,languages);
		
		for(int i = 0; i < languages.length; i++)
		{
			System.out.println("The Languager are:"+languages[i]);
		}
		Entertainment channel3 = new Entertainment("Comedy",(short)212,151,9.2f,languages);
		
		for(int i = 0; i < languages.length; i++)
		{
			System.out.println("The Languager are:"+languages[i]);
		}
		Entertainment channel4 = new Entertainment("Comedy",(short)212,151,9.2f,languages);
	}
}