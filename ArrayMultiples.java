public class ArrayMultiples
{
	public static void main(String[] args)
	{
        int[] randomValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < randomValues.length; i++) 
		{
            if (randomValues[i] % 3 == 0) 
			{
                System.out.println(randomValues[i]);
            }
        }
    }
}