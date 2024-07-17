public class IOProgram
{
	public static void main(String args[])
	{
		int result;
		int array[] = {5,4,6,9,3};
		for(int index = 0; index < array.length; index++)
		{
			result = array[index] * (array[index] + 1)/2;
			
			System.out.println("The Result is:"+result);
		}
	}
}
		