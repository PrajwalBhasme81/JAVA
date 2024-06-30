public class ArraySum
{
	public static void main(String[] args)
	{
		int values[] = {18,37,30,63,48};
		int sum=0;
		
		for(int index=0; index<values.length;index++)
		{
		sum=sum+values[index];
		}
		System.out.println("The total values sum is:"+sum);
	}
}
