public class Game
{
	public String gameType;
	public String gameName;
	public boolean isHighQuality;
	public boolean isHaveGraphics;
	public int numOfUsers;
	public float gameSize;
	
	public Game(String gameType)
	{
		this("Mobile Game","BGMI");
		System.out.println("------------------------------");
		this.gameType = gameType;
		System.out.println("The Game gameType is:"+gameType);
		System.out.println("------------------------------");
	}
	
	public Game(String gameType,String gameName)
	{
		this("Mobile Game","BGMI",true,true);
		System.out.println("------------------------------");
		this.gameType = gameType;
		this.gameName = gameName;
		System.out.println("The Game gameType is:"+gameType);
		System.out.println("The Game region is:"+gameName);
	}
	
	public Game(String gameType,String gameName,boolean isHighQuality,boolean isHaveGraphics)
	{
		this("Mobile Game","BGMI",true,true,10);
		System.out.println("------------------------------");
		this.gameType = gameType;
		this.gameName = gameName;
		this.isHighQuality = isHighQuality;
		this.isHaveGraphics = isHaveGraphics;
		System.out.println("The Game Name is:"+gameType);
		System.out.println("The Game region is:"+gameName);
		System.out.println("The Game isHighQuality:"+isHighQuality);
		System.out.println("The Game isHaveGraphics:"+isHaveGraphics);
	}
	
	public Game(String gameType,String gameName,boolean isHighQuality,boolean isHaveGraphics,int numOfUsers)
	{
		this("Mobile Game","BGMI",true,false,10,1.5f);
		System.out.println("------------------------------");
		this.gameType = gameType;
		this.gameName = gameName;
		this.isHighQuality = isHighQuality;
		this.isHaveGraphics = isHaveGraphics;
		this.numOfUsers = numOfUsers;
		System.out.println("The Game Name is:"+gameType);
		System.out.println("The Game region is:"+gameName);
		System.out.println("The Game isHighQuality:"+isHighQuality);
		System.out.println("The Game isHaveGraphics:"+isHaveGraphics);
		System.out.println("The Game numOfUsers:"+numOfUsers+"Cr");
	}
	
	public Game(String gameType,String gameName,boolean isHighQuality,boolean isHaveGraphics,int numOfUsers,float gameSize)
	{
		System.out.println("------------------------------");
		this.gameType = gameType;
		this.gameName = gameName;
		this.isHighQuality = isHighQuality;
		this.isHaveGraphics = isHaveGraphics;
		this.numOfUsers = numOfUsers;
		this.gameSize = gameSize;
		System.out.println("The Game Name is:"+gameType);
		System.out.println("The Game region is:"+gameName);
		System.out.println("The Game isHighQuality:"+isHighQuality);
		System.out.println("The Game isHaveGraphics:"+isHaveGraphics);
		System.out.println("The Game numOfUsers:"+numOfUsers+"Cr");
		System.out.println("The Game OriginYear:"+gameSize+"GB");
	}
}
