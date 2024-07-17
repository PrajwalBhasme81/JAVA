public class SongSingerRunner
{
	public static void main(String args[])
	{
		String songTypes[] = {"Rock","Hip-Pop","Disco","Folk"};
		
		for(int index = 0; index < songTypes.length; index++)
		{
			System.out.println("The Songs Types are:"+songTypes[index]);
		}
		SongSinger song1 = new SongSinger("Vijay Prakash",(short)35,965,5.11f,songTypes);
		
		for(int index = 0; index < songTypes.length; index++)
		{
			System.out.println("The Songs Types are:"+songTypes[index]);
		}
		SongSinger song2 = new SongSinger("Vijay Prakash",(short)35,965,5.11f,songTypes);
		
		for(int index = 0; index < songTypes.length; index++)
		{
			System.out.println("The Songs Types are:"+songTypes[index]);
		}
		SongSinger song3 = new SongSinger("Vijay Prakash",(short)35,965,5.11f,songTypes);
		
		for(int index = 0; index < songTypes.length; index++)
		{
			System.out.println("The Songs Types are:"+songTypes[index]);
		}
		SongSinger song4 = new SongSinger("Vijay Prakash",(short)35,965,5.11f,songTypes);
	}
}