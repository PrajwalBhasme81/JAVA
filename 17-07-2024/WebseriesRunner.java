public class WebseriesRunner
{
	public static void main(String[] args)
	{
		String languages[] = {"Hindi","English","Kannada","Telagu","Tamil"};
		
		for(int i = 0; i < languages.length; i++)
		{
			System.out.println("The Languages are:"+languages[i]);
		}
		Webseries series1 = new Webseries("Farzii",(short)3,33,8.8f,languages);
		
		for(int i = 0; i < languages.length; i++)
		{
			System.out.println("The Languages are:"+languages[i]);
		}
		Webseries series2 = new Webseries("Farzii",(short)3,33,8.8f,languages);
		
		for(int i = 0; i < languages.length; i++)
		{
			System.out.println("The Languages are:"+languages[i]);
		}
		Webseries series3 = new Webseries("Farzii",(short)3,33,8.8f,languages);
		
		for(int i = 0; i < languages.length; i++)
		{
			System.out.println("The Languages are:"+languages[i]);
		}
		Webseries series4 = new Webseries("Farzii",(short)3,33,8.8f,languages);
	}
}