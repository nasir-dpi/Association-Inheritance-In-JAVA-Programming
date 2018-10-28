package inheritance;

public class StartPoint {

	public static void main(String[] args) {
		
		
		
		
		SavingsAccount sa = new SavingsAccount("nasir", "sa-2135654", 50000.0, 8.0);
		
		
	
		
		CheckingAccount ca = new  CheckingAccount("limon", "sa-35654",75000.0, 25000.0);
		
	
		
		System.out.println("Before deposit: ");
		System.out.println(sa.getClass().getName()+":"+sa.getBalance());
		System.out.println(ca.getClass().getName()+":"+ca.getBalance());
		
		sa.deposite(25000.0);
		ca.deposite(15000.0);
		
		System.out.println("After deposit: ");
		System.out.println(sa.getClass().getName()+":"+sa.getBalance());
		System.out.println(ca.getClass().getName()+":"+ca.getBalance());
		
		
		System.out.println(sa.withdraw(50000.0));
		
		System.out.println(sa.withdraw(50000.0));
		
	
		
		System.out.println(ca.withdraw(-200000.0));
		
		
		
		System.out.println("Cell withdra using polymorphism");
		BankAccount b1 = sa;
		BankAccount b2 = ca;
		/*System.out.println(b1.withdraw(500.0));
		System.out.println(b2.withdraw(700.0)); */
		
		
		
		System.out.println(b1.getClass().getName()+":"+b1.withdraw(500.0));
		System.out.println(b2.getClass().getName()+":"+b2.withdraw(700.0));
		
		System.out.println("polymorphism using array");
		
		BankAccount []b3 = new BankAccount[2];
		b3[0] = sa;
		b3[1] = ca;
		for(BankAccount b : b3) {
			System.out.println(b.getClass().getName()+":"+b.withdraw(600.0));
		}			
			
		//4th stage
		System.out.println("Static Example");
		System.out.println(sa.bankName);
		System.out.println(ca.bankName);
		
		
		//1o stage
		/*
		
		//6th stage
		sa.bankName = "UCB";
		System.out.println(sa.bankName);
		System.out.println(ca.bankName);
		
		
		//8th stage
		ca.bankName = "BDBL";
		System.out.println(sa.bankName);
		System.out.println(ca.bankName); 
		*/
		
		
		//14th stage 
		System.out.println(BankAccount.bankName);
		
		

	}

}
