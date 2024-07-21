public class SmartWatchRunner
{
	public static void main(String args[])
	{
		SmartWatch watch1 = new SmartWatch("Apple");
		SmartWatch watch2 = new SmartWatch("Apple",2500.0f);
		SmartWatch watch3 = new SmartWatch("Apple",2500.0f,"Black");
		SmartWatch watch4 = new SmartWatch("Apple",2500.0f,"Black",5);
		SmartWatch watch5 = new SmartWatch("Apple",2500.0f,"Black",5,true);
		SmartWatch watch6 = new SmartWatch("Apple",2500.0f,"Black",5,true,4.8f);
	}
}