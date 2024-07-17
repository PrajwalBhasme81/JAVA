public class Array
{
	public static void main(String args[])
	{
		int arr[] = {0,1,0,0,1,0,1,0,1};
		int count0 = 0;
		int count1 = 0;
		
		for (int index = 0; index < arr.length; index++)
		{
			if(arr[index] == 0)
			{
				count0++;
			}
			else
			{
				count1++;
			}
		}
		
		System.out.println("The Total Numbers of 0's are:"+count0);
		System.out.println("The Total Numbers of 1's are:"+count1);
	}
}