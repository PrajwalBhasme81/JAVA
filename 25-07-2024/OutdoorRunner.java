public class OutdoorRunner
{
	public static void main(String args[])
	{
		Outdoor game = new Outdoor();
		
		System.out.println("Array Size is :"+game.getArrLength());
		game.getArrLength();
		System.out.println("--------Create-------");
		game.createoutdoorArray("Cricket");
		game.createoutdoorArray("Hockey");
		game.createoutdoorArray("Kho-Kho");
		game.createoutdoorArray("Khabaddi");
		game.readoutdoorArray();
		System.out.println("--------Update-------");
		String update = game.updateoutdoorArray("Khabaddi","VallyBall");
		System.out.println(update);
		game.readoutdoorArray();
		System.out.println("--------Delete-------");
		String delete = game.deleteoutdoorArray("Hockey");
		System.out.println(delete);
		game.readoutdoorArray();
		System.out.println("--------Search-------");
		String search = game.searchoutdoorArray("Cricket");
		System.out.println(search);
		game.readoutdoorArray();
	}
}
		