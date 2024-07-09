public class IrctcRunner
{
	public static void main(String args[])
	{
		Irctc.Booking();
		Irctc.Booking("IRCTC CONNECT",83);
		Irctc.Booking(10.4f);
		String types[] = {"Train","Bus","Flights","Hotel"};
		Irctc.Booking(types);
	}
}
