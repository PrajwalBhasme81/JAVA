public class PhonePayRunner
{
	public static void main(String args[])
	{
		PhonePay.login();
		PhonePay.account(453745845763L);
		PhonePay.upi();
		String applications[]= {"Payment","Bill","Recharge"};
		PhonePay.status(applications,true);
		
	} 
}