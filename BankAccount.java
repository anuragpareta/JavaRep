package oops_concepts;

public class BankAccount {
	
	private long accNo;
	private String accName;
	private double accBalance;
	
	
	public void deposit(double amt) {
		if(amt>0) {
			accBalance = accBalance+amt;
			System.out.println("Successfully deposite $"+amt);
		}
		else {
			System.out.println("Cannot deposite $"+amt);
		}
	}
	
	public void withdraw(double amt) {
		if(amt>0) {
			accBalance = accBalance-amt;
			System.out.println("Successfully withdraw $"+amt);
		}
		else {
			System.out.println("Cannot withdraw $"+amt);
		}
	}
	
	public void displayCurrentBalance() {
		System.out.println("Your current balance is $"+accBalance);
	}
	
	public BankAccount(long accNo, String accName, double accBalance) {
		this.accNo = accNo;
		this.accName = accName;
		this.accBalance = accBalance; 
		
	}
	
	

}
