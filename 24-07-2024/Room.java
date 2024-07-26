public class Room
{
	static int roomNumber = 123;
	static boolean isAttachBathroom;
	static float height = 10.0f;
	static float width = 20.0f;
	static String ownerName = "Katappa";
	
	int numOfSharing;
	boolean isclean;
	String roomColor;
	boolean isHavingElectricity;
	int numOfWindows;
	
	public Room(int numOfSharing,boolean isclean,String roomColor,boolean isHavingElectricity,int numOfWindows)
	{
		this.numOfSharing = numOfSharing;
		this.isclean = isclean;
		this.roomColor = roomColor;
		this.isHavingElectricity = isHavingElectricity;
		this.numOfWindows = numOfWindows;
		
		System.out.println("The Room Number is:"+roomNumber);
		System.out.println("The isAttachBathroom :"+isAttachBathroom);
		System.out.println("The Room height is:"+height);
		System.out.println("The Room width is:"+width);
		System.out.println("The Room ownerName is:"+ownerName);
		System.out.println("-------------------------------");
		System.out.println("The numOfSharing is:"+numOfSharing);
		System.out.println("The isclean:"+isclean);
		System.out.println("The Room Color:"+roomColor);
		System.out.println("The isHavingElectricity:"+isHavingElectricity);
		System.out.println("The numOfWindows:"+numOfWindows);
	}
}
	
	
