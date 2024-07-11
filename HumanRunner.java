public class HumanRunner
{
	public static void main(String args[])
	{
		Human.person();
		Human.person('M');
		Human.person('M',23);
		Human.person('M',23,5.6f);
		Human.person('M',23,5.6f,62.33d);
		Human.person('M',23,5.6f,62.33d,10);
		Human.person('M',3,23,5.6f,62.33d,10);
	}
}