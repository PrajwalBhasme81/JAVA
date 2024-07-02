public class PaymentRunner
{
	public static void main(String[] args)
	{
		System.out.println("Payment Details");		
		Payment.getPaymentId();
		Payment.getAmount();
		Payment.getPaymentDate();
		Payment.getPaymentMethod();
		Payment.getReceiver();
	}
}