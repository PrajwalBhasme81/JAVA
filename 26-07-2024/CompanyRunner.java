public class CompanyRunner
{
	public static void main(String args[])
	{
		Company company = new Company();
		
		company.setCompanyName("PB Technologies");
		System.out.println("The Company Name is: "+company.getCompanyName());
		company.setCeo("Mr.Boss");
		System.out.println("The Company CEO is: "+company.getCeo());
		company.setAddress("Electronic City");
		System.out.println("The Company Address is: "+company.getAddress());
		company.setCity("Bangalore");
		System.out.println("The Company City is: "+company.getCity());
		company.setCountry("India");
		System.out.println("The Company Country is: "+company.getCountry());
		company.setNumOfEmployees(800);
		System.out.println("The Num Of Employees are: "+company.getNumOfEmployees());
		company.setNumOfBranches(10);
		System.out.println("The Num Of Branches are: "+company.getNumOfBranches());
		company.setCompanyType("Product Based");
		System.out.println("The Company Type is: "+company.getCompanyType());
		company.setWebsite("www.pbtechno@gmail.com");
		System.out.println("The Company Website is: "+company.getWebsite());
		company.setYearOfEstablished(2030);
		System.out.println("The Company Established in: "+company.getYearOfEstabilshed());
	}
}
		
		
		