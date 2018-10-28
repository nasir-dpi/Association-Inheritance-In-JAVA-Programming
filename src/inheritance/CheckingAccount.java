package inheritance;

	

public class CheckingAccount extends BankAccount {
	
	
	 
	public CheckingAccount() {
		super();
	}


	private double ServiceCharge;

		
	
	 
	
	public double getServiceCharge() {
		return ServiceCharge;
	}

	public CheckingAccount(String accountName, String accountNo, double balance, double serviceCharge) {
		super(accountName, accountNo, balance);
		ServiceCharge = serviceCharge;
	}

	public void setServiceCharge(double serviceCharge) {
		ServiceCharge = serviceCharge;
	}
	
	
	@Override
	public String withdraw(double amount) {
		// TODO Auto-generated method stub
		setBalance(getBalance()-amount);
		return amount+" withdrawn from your account.";
	}
		
		
}
