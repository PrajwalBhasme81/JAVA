public class MobileRunner
{
	public static void main(String args[])
	{
		Mobile mobile = new Mobile();
		System.out.println("Array Size"+mobile.getBrandArrayLength());
		System.out.println("--------Create--------");
		mobile.createBrandArray("Poco");
		mobile.createBrandArray("Redmi");
		mobile.createBrandArray("Samsung");
		mobile.createBrandArray("Vivo");
		mobile.readBrandArray();
		System.out.println("--------Update--------");
		String update = mobile.updateBrandArray("Samsung","Oppo");
		System.out.println(update);
		mobile.readBrandArray();
		System.out.println("--------Delete--------");
		String delete = mobile.deleteBrandArray("Redmi");
		System.out.println(update);
		mobile.readBrandArray();
		System.out.println("--------Search--------");
		String search = mobile.searchByBrandArray("Vivo");
		System.out.println(update);
		mobile.readBrandArray();
	}
}
		