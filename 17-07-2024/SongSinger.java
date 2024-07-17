public class SongSinger
{
	public String singerName;
	public short singerAge;
	public int totalSongs;
	public float singerHeight;
	public String[] songTypes;
	
	public SongSinger(String singerName,short singerAge,int totalSongs,float singerHeight,String[] songTypes)
	{
		this.singerName = singerName;
		this.singerAge = singerAge;
		this.totalSongs = totalSongs;
		this.singerHeight = singerHeight;
		this.songTypes = songTypes;
		
		System.out.println("The Singer Name is:"+singerName);
		System.out.println("The Singer Age is:"+singerAge);
		System.out.println("The Total Songs are:"+totalSongs);
		System.out.println("The Singer Height is:"+singerHeight);
		System.out.println("------------------------------");
	}
}