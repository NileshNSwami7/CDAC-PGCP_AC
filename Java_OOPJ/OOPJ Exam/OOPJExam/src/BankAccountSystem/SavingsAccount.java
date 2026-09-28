package BankAccountSystem;

public class SavingsAccount extends Account{

	public SavingsAccount(int accountNumber,double balance) {
		super(accountNumber,balance);
	}
	
	public void withdraw(double amount) throws InsufficientBalanceException {
		if(this.getBalance() - amount<500) {
			throw new InsufficientBalanceException("Withdrawal denied due to insufficient balance.'\n'"
					+ "Savings account must maintain minimum balance of 500.");
		}
		setBalance(this.getBalance()-amount);
	}
}
