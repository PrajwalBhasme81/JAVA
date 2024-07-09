public class PVRRunner
{
	public static void main(String args[])
	{
		PVR.Ticket();
		PVR.Ticket("PVR Cinemas",37);
		PVR.Ticket(10f);
		String types[] = {"Trilling","Action","Romantic","Horrer"};
		PVR.Ticket(types);
	}
}
