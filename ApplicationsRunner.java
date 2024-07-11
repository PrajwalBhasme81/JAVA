public class ApplicationsRunner
{
	public static void main(String args[])
	{
		Applications.app();
		Applications.app(339.00d);
		Applications.app("Instagram",339.00d);
		Applications.app("Instagram","Kevin Systro",339.00d);
		Applications.app("Instagram","Kevin Systro",339.00d,500000000);
		Applications.app("Instagram","Kevin Systro",339.00d,96.6f,500000000);
		Applications.app("Instagram",4.8f,"Kevin Systro",339.00d,96.6f,500000000);
		Applications.app("Instagram",4.8f,"Kevin Systro",339.00d,96.6f,500000000,"Social Media");
		Applications.app("Instagram",4.8f,"Kevin Systro",339.00d,"Android",96.6f,500000000,"Social Media");
		Applications.app("Instagram",4.8f,"Kevin Systro",339.00d,2010,"Android",96.6f,500000000,"Social Media");
		Applications.app("Instagram",4.8f,"Kevin Systro",339.00d,"Create Videos",2010,"Android",96.6f,500000000,"Social Media");
	}
}