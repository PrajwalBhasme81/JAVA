public class PhotoShopRunner
{
	public static void main(String args[])
	{
		PhotoShop.App();
		PhotoShop.App("PhotoEditing", 502);
		PhotoShop.App(4.8f);
		String tools[] = {"Crop","ChangeBg","Resize","Filter","AddImages"};
		PhotoShop.App(tools);
	}
}