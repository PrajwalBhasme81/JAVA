public class ArrayHolderRunner
{
	public static void main(String[] args)
	{
		for(int i=0;i<ArrayHolder.valuesArray.length;i++)
		{
			System.out.println("Array values are:"+ArrayHolder.valuesArray[i]);
		}
		for(int j=0;j<ArrayHolderType.randomArray.length;j++)
		{
			System.out.println("Array values are:"+ArrayHolderType.randomArray[j]);
		}
	}
}
