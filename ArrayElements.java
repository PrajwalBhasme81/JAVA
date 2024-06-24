public class ArrayElements
{
	public static void main(String args[])
	{
		int naturalNum[] = {1,2,3,4,5};
		String names[] = {"Ram", "Sita", "Laxman", "Hanuman", "Ravana", "Vibishan"};
		char grade[] = {'A', 'B', 'C', 'F'};
		short marks[] = {70,85,92,40,98,67,30,37};
		byte shoeSize[] = {4,5,6,7,8,9};
		float centiMeters[] = {1.1f,4.3f,9.0f,3.7f,3.0f};
		double averageMarks[] = {6.22,7.18,8.54,5.34,9.88};
		boolean booleanArray[] = {true,false,false,true,true};
		long meters[] = {100L,200L,300L,400L,500L};
		
		
		for(int i=0;i<naturalNum.length;i++)
		{
			System.out.println("Natural Numbers are:"+naturalNum[i]);
		}
		System.out.println("Length of Natural Numbers Array is:"+naturalNum.length+"\n");
		
		for(int i=0;i<names.length;i++)
		{
			System.out.println("Name is:"+names[i]);
		}
		System.out.println("Length of Names Array is:"+names.length+"\n");
		
		for(int i=0;i<grade.length;i++)
		{
			System.out.println("Grade is:"+grade[i]);
		}
		System.out.println("Length of Grade Array is:"+grade.length+"\n");
		
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Marks is:"+marks[i]);
		}
		System.out.println("Length of Marks Array is:"+marks.length+"\n");
		
		for(int i=0;i<shoeSize.length;i++)
		{
			System.out.println("Shoe Size is:"+shoeSize[i]);
		}
		System.out.println("Length of Shoe Size Array is:"+shoeSize.length+"\n");
		
		for(int i=0;i<centiMeters.length;i++)
		{
			System.out.println("CentiMeters are:"+centiMeters[i]);
		}
		System.out.println("Length of CentiMeters Array is:"+centiMeters.length+"\n");
		
		for(int i=0;i<averageMarks.length;i++)
		{
			System.out.println("Average Marks is:"+averageMarks[i]);
		}
		System.out.println("Length of Average Marks Array is:"+averageMarks.length+"\n");
		
		for(int i=0;i<booleanArray.length;i++)
		{
			System.out.println("BooleanArray is:"+booleanArray[i]);
		}
		System.out.println("Length of Boolean Array is:"+booleanArray.length+"\n");
		
		for(int i=0;i<meters.length;i++)
		{
			System.out.println("Meters are:"+meters[i]);
		}
		System.out.println("Length of Meters Array is:"+meters.length+"\n");
	}
}