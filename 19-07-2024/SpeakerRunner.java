public class SpeakerRunner
{
	public static void main(String args[])
	{
		Speaker sound1 = new Speaker("JBL");
		Speaker sound2 = new Speaker("JBL",1200.0f);
		Speaker sound3 = new Speaker("JBL",1200.0f,"Blue");
		Speaker sound4 = new Speaker("JBL",1200.0f,"Blue",10);
		Speaker sound5 = new Speaker("JBL",1200.0f,"Blue",10,true);
		Speaker sound6 = new Speaker("JBL",1200.0f,"Blue",10,true,4.4f);
	}
}