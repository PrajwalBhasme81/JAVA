public class PCRunner
{
	public static void main(String args[])
	{
		String ports[] = {"USB-A", "USB-C", "HDMI", "Ethernet"};
		
		PC computer = new PC();
		
		PC computer1 = new PC("HP");
		
		PC computer2 = new PC("HP","Pavilion");
		
		PC computer3 = new PC("HP","Pavilion","AMD Ryzen 5");

		PC computer4 = new PC("HP","Pavilion","AMD Ryzen 5",8);
		
		PC computer5 = new PC("HP","Pavilion","AMD Ryzen 5",8,256.0f);
		
		PC computer6 = new PC("HP","Pavilion","AMD Ryzen 5",8,256.0f,false);
		
		PC computer7 = new PC("HP","Pavilion","AMD Ryzen 5",8,256.0f,false,650.0f);
		
		PC computer8 = new PC("HP","Pavilion","AMD Ryzen 5",8,256.0f,false,650.0f,"Windows 11");
		
		PC computer9 = new PC("HP","Pavilion","AMD Ryzen 5",8,256.0f,false,650.0f,"Windows 11",2023);
		
		PC computer10 = new PC("HP","Pavilion","AMD Ryzen 5",8,256.0f,false,650.0f,"Windows 11",2023,ports);
		
		for(int i = 0; i < ports.length; i++)
		{
			System.out.println("The ports are:"+ports[i]);
		}
	}
}
		
		
		
		
		
		