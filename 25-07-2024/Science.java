public class Science
{
	public int index = 0;
	String subjectNames[] = new String[3];
	
	public int getArrLength()
	{
		return subjectNames.length;
	}
	
	public String createSubjectArray(String subject)
	{
		if(this.index < this.getArrLength())
		{
			subjectNames[index] = subject;
			index++;
		}
		else
		{
			System.out.println("Array is Full");
		}
		return "Created Successfully";
	}
	
	public void readSubjectArray()
	{
		for(int index = 0;index < this.getArrLength();index++)
		{
			System.out.println("The Subject are:"+subjectNames[index]);
		}
	}
	
	public String updateSubjectArray(String oldSubject,String newSubject)
	{
		for(int index = 0;index < this.getArrLength();index++)
		{
			if(subjectNames[index] == oldSubject)
			{
				subjectNames[index] = newSubject;
				System.out.println("The Subject are:"+subjectNames[index]);
				return "Updated";
			}
		}
		return "Not Updated";
	}
	
	public String deleteSubjectArray(String subject)
	{
		for(int index = 0;index < this.getArrLength();index++)
		{
			if(subjectNames[index] == subject)
			{
				subjectNames[index] = null;
				System.out.println("The Subject are:"+subjectNames[index]);
				return "Deleted";
			}
		}
		return "Not Deleted";
	}
	
	public String searchSubjectArray(String subjectName)
	{
		for(String name: subjectNames)
		{
			if(subjectName == name)
			{
				return "Found :"+subjectName;
			}
		}
		return "Search Result not Found";
	}
}