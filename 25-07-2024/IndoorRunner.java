public class IndoorRunner
{
	public static void main(String args[])
	{
		Indoor game = new Indoor();
		
		System.out.println("Array Size is :"+game.getArrLength());
		game.getArrLength();
		System.out.println("--------Create-------");
		game.createIndoorArray("Badminton");
		game.createIndoorArray("Carrom");
		game.createIndoorArray("Chess");
		game.createIndoorArray("Uno");
		game.readIndoorArray();
		System.out.println("--------Update-------");
		String update = game.updateIndoorArray("Badminton","Ludo");
		System.out.println(update);
		game.readIndoorArray();
		System.out.println("--------Delete-------");
		String delete = game.deleteIndoorArray("Carrom");
		System.out.println(delete);
		game.readIndoorArray();
		System.out.println("--------Search-------");
		String search = game.searchIndoorArray("Chess");
		System.out.println(search);
		game.readIndoorArray();
	}
}
		