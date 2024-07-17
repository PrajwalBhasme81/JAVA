public class SolarSystemRunner
{
	public static void main(String args[])
	{
		String planets[] = {"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune"};
		
		for(int i = 0; i < planets.length; i++)
		{
			System.out.println("The Planets are:"+planets[i]);
		}
		
		SolarSystem solar1 = new SolarSystem("Sun",(short)8,200,4.6f,planets);
		
		for(int i = 0; i < planets.length; i++)
		{
			System.out.println("The Planets are:"+planets[i]);
		}
		
		SolarSystem solar2 = new SolarSystem("Sun",(short)8,200,4.6f,planets);
		
		for(int i = 0; i < planets.length; i++)
		{
			System.out.println("The Planets are:"+planets[i]);
		}
		
		SolarSystem solar3 = new SolarSystem("Sun",(short)8,200,4.6f,planets);
		
		for(int i = 0; i < planets.length; i++)
		{
			System.out.println("The Planets are:"+planets[i]);
		}
		
		SolarSystem solar4 = new SolarSystem("Sun",(short)8,200,4.6f,planets);
		
	}
}
	
