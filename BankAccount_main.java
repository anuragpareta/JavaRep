package oops_concepts;

public class BankAccount_main {
	
	public static void main(String[] args) {
		
		BankAccount bact= new BankAccount(9855663, "Maxwell", 1000000);
		
		bact.displayCurrentBalance();
		
		bact.withdraw(150900);
		
		bact.deposit(250000);
		
		bact.displayCurrentBalance();
		
		bact.withdraw(-253669);
	}

}
