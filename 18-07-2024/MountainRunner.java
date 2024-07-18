public class MountainRunner
{
	public static void main(String args[])
	{
		String first_ascenders[] = {"Edmund Hillary", "Tenzing Norgay"};
		
		Mountain mountain = new Mountain();
		
		Mountain mountain1 = new Mountain("Mount Everest");
		
		Mountain mountain2 = new Mountain("Mount Everest",8848.86f);
		
		Mountain mountain3 = new Mountain("Mount Everest",8848.86f,"Nepal/China");
		
		Mountain mountain4 = new Mountain("Mount Everest",8848.86f,"Nepal/China",1953);
		
		Mountain mountain5 = new Mountain("Mount Everest",8848.86f,"Nepal/China",1953,true);
		
		Mountain mountain6 = new Mountain("Mount Everest",8848.86f,"Nepal/China",1953,true,"Himalayas");
		
		Mountain mountain7 = new Mountain("Mount Everest",8848.86f,"Nepal/China",1953,true,"Himalayas","Extreme");
		
		Mountain mountain8 = new Mountain("Mount Everest",8848.86f,"Nepal/China",1953,true,"Himalayas","Extreme",-19.0f);
		
		Mountain mountain9 = new Mountain("Mount Everest",8848.86f,"Nepal/China",1953,true,"Himalayas","Extreme",-19.0f,800);
		
		Mountain mountain10 = new Mountain("Mount Everest",8848.86f,"Nepal/China",1953,true,"Himalayas","Extreme",-19.0f,800,first_ascenders);
		
		for(int i = 0; i < first_ascenders.length; i++)
		{
			System.out.println("The first_ascenders are:"+first_ascenders[i]);
		}
	}
}
		
		
		
		
		
		
		
		
