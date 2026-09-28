package BankAccountSystem;

public class CurrentAccount extends Account{
	
	public CurrentAccount(int accountNumber,double balance) {
		super(accountNumber,balance);
	}
	
	public void withdraw(double amount) throws InsufficientBalanceException{
		if(this.getBalance() - amount<0) {
			throw new InsufficientBalanceException("Withdrawal denied due to insufficient balance");
		}
		setBalance(this.getBalance()-amount);
	}

}
