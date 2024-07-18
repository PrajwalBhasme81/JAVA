public class SportsRunner
{
	public static void main(String args[])
	{
		String famous_players[] = {"Michael Jordan", "LeBron James", "Kobe Bryant"};
		
		Sports sports = new Sports();
		
		Sports sports1 = new Sports("Basketball");
		
		Sports sports2 = new Sports("Basketball",5);
	
		Sports sports3 = new Sports("Basketball",5,48.0f);
		
		Sports sports4 = new Sports("Basketball",5,48.0f,true);
		
		Sports sports5 = new Sports("Basketball",5,48.0f,true,"USA");
		
		Sports sports6 = new Sports("Basketball",5,48.0f,true,"USA","FIBA");
		
		Sports sports7 = new Sports("Basketball",5,48.0f,true,"USA","FIBA","28m x 15m");
		
		Sports sports8 = new Sports("Basketball",5,48.0f,true,"USA","FIBA","28m x 15m",24.26f);
		
		Sports sports9 = new Sports("Basketball",5,48.0f,true,"USA","FIBA","28m x 15m",24.26f,600.0f);
		
		Sports sports10 = new Sports("Basketball",5,48.0f,true,"USA","FIBA","28m x 15m",24.26f,600.0f,famous_players);
		
		for(int i = 0; i < famous_players.length; i++)
		{
			System.out.println("The famous_players are:"+famous_players[i]);
		}
	}
}
		
		
		
		
		
		