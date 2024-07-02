public class LoanRunner
{
	public static void main(String[] args)
	{
		System.out.println("Loan Details");		
		Loan.getLoanId();
		Loan.getLoanAmount();
		Loan.getInterestRate();
		Loan.getTermInYear();
		Loan.getBorrower();
	}
}