public class JobApplication
{
	String jobName;
	String applicantName;
	int applicantAge;
	String applicantPlace;
	String qualification;
	float sslcMarks;
	float degreePercentage;
	String[] skills;
	
	public JobApplication()
	{
		System.out.println("-------------------------------");
		System.out.println("This is the No-Argument constructor");
		System.out.println("-------------------------------");
	}
	
	public JobApplication(String jobName,String applicantName,int applicantAge,String applicantPlace,String qualification,float sslcMarks,float degreePercentage,String[] skills)
	{
		this.jobName = jobName;
		this.applicantName = applicantName;
		this.applicantAge = applicantAge;
		this.applicantPlace = applicantPlace;
		this.qualification = qualification;
		this.sslcMarks = sslcMarks;
		this.degreePercentage = degreePercentage;
	
		System.out.println("The Job Name is:"+jobName);
		System.out.println("The Applicant Name is:"+applicantName);
		System.out.println("The Applicant Age is:"+applicantAge);
		System.out.println("The Applicant Place is:"+applicantPlace);
		System.out.println("The Applicant qualification is:"+qualification);
		System.out.println("The Applicant SSLC Marks is:"+sslcMarks);
		System.out.println("The Applicant Degree Percentage is:"+degreePercentage);
		System.out.println("-------------------------------");
	}
	
	public void eligible()
	{
		if(applicantAge < 18)
		{
			System.out.println("Not Eligible for Job");
			System.out.println("-------------------------------");
		}
	}
	
	public void check(int applicantAge,String qualification)
	{
		if(this.applicantAge > 21 && this.qualification == "BE")
		{
			System.out.println("Eligible for Applying Software Job");
			System.out.println("-------------------------------");
		}
		else
		{
			System.out.println("Not Eligible for Applying Software Job");
			System.out.println("-------------------------------");
		}
	}
	
	public String match(String qualification,String skills)
	{
		if(this.qualification == "BE" && this.skills != null)
		{
			System.out.println("Eligible for Applying Java Developer");
			System.out.println("-------------------------------");
			return "match";
		}
		else
		{
			System.out.println("Not Eligible for Applying Java Developer");
			System.out.println("-------------------------------");
			return "not match";
		}
	}
	
	public float percentage(float sslcMarks)
	{
		int totalMarks = 625;
		float totalPercentage;
		
		totalPercentage = (this.sslcMarks/totalMarks)*100;
		
		System.out.println("The SSLC Percentage is:"+totalPercentage);
		System.out.println("-------------------------------");
		return 0.0f;
	}
	
	public String apply(float degreePercentage,String qualification)
	{
		if(this.degreePercentage > 5.0 && this.qualification == "BE")
		{
			System.out.println("Eligible for Applying Software Developer");
			System.out.println("-------------------------------");
			return "apply";
		}
		else
		{
			System.out.println("Not Eligible for Applying Software Developer");
			System.out.println("-------------------------------");
			return "not apply";
		}
	}
}
	
	
