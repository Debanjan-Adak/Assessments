package exception.u_e;

class InsufficientBalanceException extends RuntimeException {
	public InsufficientBalanceException(String message) {
		super(message);
	}
}

public class CustomUncheckedExceptionDemo {
	
	public static void withdraw(double balance,double amount) {
		if(amount>balance)
		{
			throw new InsufficientBalanceException("Withdrawal amount exceeps the available balance");
		}
		System.out.println("Withdrawl successful! Remaining balance: "+(balance-amount));
	}
	public static void main(String[] args) {
		double balance =5000;
		double withdrawalAmount =6000;
		try {
			withdraw(balance, withdrawalAmount);
		} catch (Exception e) {
			System.out.println("Exception Caught: "+e.getMessage()	);
		} 
		
	} 

}
