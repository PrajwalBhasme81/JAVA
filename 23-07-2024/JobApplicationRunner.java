public class JobApplicationRunner
{
	public static void main(String args[])
	{
		String[] skills = {"java","sql","html","css","js","jsp","jdbc","springBoot"};
		
		JobApplication job = new JobApplication();
		JobApplication job1 = new JobApplication("Java Developer","Prajwal",23,"GADAG","BE",534.0f,7.1f,skills);
		
		job1.eligible();
		job1.check(23,"BE");
		job1.match("BE","java");
		job1.percentage(534.0f);
		job1.apply(7.1f,"BE");
		
		for(int i = 0;i < skills.length;i++)
		{
			System.out.println("The Skills are:"+skills[i]);
		}
		
	}
}
		
