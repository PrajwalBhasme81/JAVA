public class Nation
{
	public String nationName;
	public short nationStates;
	public int totalNations;
	public float population;
	public String[] languages;
	
	public Nation(String nationName,short nationStates,int totalNations,float population,String[] languages)
	{
		this.nationName = nationName;
		this.nationStates = nationStates;
		this.totalNations = totalNations;
		this.population = population;
		this.languages = languages;
		
		System.out.println("The Nation Name is:"+nationName);
		System.out.println("The Total Nation States is:"+nationStates);
		System.out.println("The Total Nation are:"+totalNations);
		System.out.println("The Total Population is:"+population);
		System.out.println("------------------------------");
	}
}