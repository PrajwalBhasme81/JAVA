public class ArrayEOCount
{
	public static void main(String[] args)
	{
		int[] numbers = {30,37,18,63,87};
		System.out.print("Please enter the number of elements in the array: "+numbers.length +"\n");
		int evenCount = 0;
		int oddCount = 0;
        for (int i = 0; i < numbers.length; i++) 
		{
            if (numbers[i] % 2 == 0) 
			{
                evenCount++;
            } 
			else 
			{
                oddCount++;
            }
        }
        System.out.println("Total number of even numbers in this array: " + evenCount);
        System.out.println("Total number of odd numbers in this array: " + oddCount);
    }
}
	
		
				
