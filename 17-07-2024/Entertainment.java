public class Entertainment
{
	public String type;
	public short channelNumber;
	public int totalChannels;
	public float rating;
	public String[] languages;
	
	public Entertainment(String type,short channelNumber,int totalChannels,float rating,String[] languages)
	{
		this.type = type;
		this.channelNumber = channelNumber;
		this.totalChannels = totalChannels;
		this.rating = rating;
		this.languages = languages;
		
		System.out.println("The Entertainment Type is:"+type);
		System.out.println("The Entertainment Channel Number is:"+channelNumber);
		System.out.println("The Entertainment Total Channels are:"+totalChannels);
		System.out.println("The Rating is :"+rating);
		System.out.println("----------------------------------------------");
	}
}