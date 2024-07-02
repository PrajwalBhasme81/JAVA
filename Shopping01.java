public class Shopping01
{
	public static void shoppingType(String ShoppingType)
	{
		System.out.println("The Shopping Type is :"+ShoppingType);
	}
	
	public static void totalPrice(double Price,float gst)
	{
		System.out.println("The Price is:"+Price);
		System.out.println("The GST is:"+gst);
		double totalprice = gst*Price+Price;
		System.out.println("The Total Price is:"+totalprice);
	}		
	
	public static void shopped(String ItemName,String ShoppingType)
	{
		System.out.println("The Item Name is :"+ItemName);
		System.out.println("The Shopping Type is :"+ShoppingType);
	}
	
	public static void shoppingDetails(double totalprice,String ItemName,String ShoppingType)
	{
		System.out.println("The Total Price is:"+totalprice);
		System.out.println("The Item Name is :"+ItemName);
		System.out.println("The Shopping Type is :"+ShoppingType);
	}
}
