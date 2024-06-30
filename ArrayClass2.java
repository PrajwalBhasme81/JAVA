public class ArrayClass2
{
    public static void main(String[] args) 
	{
        int[] randomnum = {11, 25, 30, 37, 95};
		char[] initials = {'P','N','K','S','R'};
		long[] population = { 1000000000L, 2000000000L, 3000000000L, 4000000000L };
		String[] movies = {"Kalki","Pushpa","Kotee"};
		
		System.out.println("Array length: " + randomnum.length);
		System.out.println("Array length: " + initials.length);
		System.out.println("Array length: " + population.length);
		System.out.println("Array length: " + movies.length);
		
		for (int i = 0; i < randomnum.length; i++) 
		{
		System.out.println("Elements are :"  +randomnum[i]);
        }
		for (int k = 0; k < initials.length; k++) 
		{
		System.out.println("Elements are :"  +initials[k]);
		}
		for (int n = 0; n < population.length; n++) 
		{
		System.out.println("Elements are :"  +population[n]);
		}
		for (int q = 0; q < movies.length; q++) 
		{
		System.out.println("Elements are :"  +movies[q]);
		}
	}
}