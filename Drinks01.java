public class Drinks01 
{

    public static void chooseDrink(String drink) 
	{
        if (drink == "Coffee") 
		{
            System.out.println("You chose Coffee.");
        }
        if (drink == "Tea") 
		{
            System.out.println("You chose Tea.");
        }
        if (drink == "Juice") 
		{
            System.out.println("You chose Juice.");
        }
    }

    public static void checkTemperature(int temperature) 
	{
        if (temperature > 60) 
		{
            System.out.println("The drink is hot.");
        }
        if (temperature < 20) 
		{
            System.out.println("The drink is cold.");
        }
        if (temperature >= 20 && temperature <= 60) 
		{
            System.out.println("The drink is warm.");
        }
    }

    public static void addSugar(boolean addSugar) 
	{
        if (addSugar) 
		{
            System.out.println("Sugar added.");
        }
        if (!addSugar) 
		{
            System.out.println("No sugar added.");
        }
    }

    public static void checkSize(String size) 
	{
		
        if (size == "Small") 
		{
            System.out.println("Small drink.");
        }
        if (size == "Medium") 
		{
            System.out.println("Medium drink.");
        }
        if (size == "Large") 
		{
            System.out.println("Large drink.");
       		 }
    	}
}
