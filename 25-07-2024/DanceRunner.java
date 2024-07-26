public class DanceRunner
{
	public static void main(String args[])
	{
		Dance type = new Dance();
		
		System.out.println("Array Size is :"+type.getArrLength());
		type.getArrLength();
		System.out.println("--------Create-------");
		type.createdanceArray("Bharatanatyam");
		type.createdanceArray("Kathakali");
		type.createdanceArray("Kuchipudi");
		type.createdanceArray("Odissi");
		type.readdanceArray();
		System.out.println("--------Update-------");
		String update = type.updatedanceArray("Odissi","Yakshagana");
		System.out.println(update);
		type.readdanceArray();
		System.out.println("--------Delete-------");
		String delete = type.deletedanceArray("Kuchipudi");
		System.out.println(delete);
		type.readdanceArray();
		System.out.println("--------Search-------");
		String search = type.searchdanceArray("Bharatanatyam");
		System.out.println(search);
		type.readdanceArray();
	}
}
		