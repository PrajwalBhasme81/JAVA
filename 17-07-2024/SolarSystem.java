public class SolarSystem
{
	public String star;
	public short totalPlanets;
	public int totalMoons;
	public float formed;
	public String[] planets;
	
	public SolarSystem(String star,short totalPlanets,int totalMoons,float formed,String[] planets)
	{
		this.star = star;
		this.totalPlanets = totalPlanets;
		this.totalMoons = totalPlanets;
		this.formed = formed;
		this.planets = planets;
		
		System.out.println("The Nearest Star is:"+star);
		System.out.println("The Total Planets in SolarSystem is:"+totalPlanets);
		System.out.println("The Total Moons in SolarSystem is:"+totalMoons);
		System.out.println("The SolarSystem Formed in:"+formed+"Billion Years Ago");
		System.out.println("----------------------------------------------");
	}
}