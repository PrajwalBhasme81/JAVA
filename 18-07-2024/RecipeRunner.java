public class RecipeRunner
{
	public static void main(String args[])
	{
		String ingredients[] = {"Cooking Rice","Egg","Spring Onion","Oil","Chilly Powder","Salt"};
		
		Recipe food = new Recipe();
		
		Recipe food1 = new Recipe("Egg Rice");
		
		Recipe food2 = new Recipe("Egg Rice",4);
		
		Recipe food3 = new Recipe("Egg Rice",4,20.0f);
		
		Recipe food4 = new Recipe("Egg Rice",4,20.0f,false);
		
		Recipe food5 = new Recipe("Egg Rice",4,20.0f,false,400.0f);
		
		Recipe food6 = new Recipe("Egg Rice",4,20.0f,false,400.0f,"Indian");
		
		Recipe food7 = new Recipe("Egg Rice",4,20.0f,false,400.0f,"Indian","RamBabu");
		
		Recipe food8 = new Recipe("Egg Rice",4,20.0f,false,400.0f,"Indian","RamBabu","23-05-1988");
		
		Recipe food9 = new Recipe("Egg Rice",4,20.0f,false,400.0f,"Indian","RamBabu","23-05-1988","Easy");
		
		Recipe food10 = new Recipe("Egg Rice",4,20.0f,false,400.0f,"Indian","RamBabu","23-05-1988","Easy",ingredients);
		
		for(int i = 0; i < ingredients.length; i++)
		{
			System.out.println("The ingredients are:"+ingredients[i]);
		}
	}
}
		
		
