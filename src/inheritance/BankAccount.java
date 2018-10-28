
package inheritance;
	
public abstract class BankAccount {
	
	
	private String accountName;
	private String accountNo;
	private double balance;
	//1st stage
	//public String bankName;
	//2nd stage
	// public static String bankName;
	//3rd stage
	//public static String bankName = "DMPI";
	
	//5th stage
	//public  String bankName = "DMPI";
	
	//7th stage
	//public static String bankName = "DMPI";
	
	// 9th stage
	//public  static final String bankName = "DMPI";
	
	//12th stage
	//public  static final String bankName ;
	
	//13th stage
	public  static final String bankName = "DMPI";
	
	
	
	
			
	
public BankAccount(String accountName, String accountNo, double balance) {
	
	
		this.accountName = accountName;
		this.accountNo = accountNo;
		this.balance = balance;
	}




public BankAccount() {
	super();
}




public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	

		public  String deposite(double amount) {
			
			
			
			balance +=amount;
			return amount+"deposited to your account.";

				}
	
	
		
		
	
		public abstract String withdraw(double amount);
		
	
	
}


