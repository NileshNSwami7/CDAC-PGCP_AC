package BankAccountSystem;

public class Account {
	
	private int accountNumber;
	private double balance;
	
	public Account() {
		super();
	}

	public Account(int accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void withdraw(double amount) throws InsufficientBalanceException {
		if(this.getBalance() - amount<500) {
			throw new InsufficientBalanceException("Withdrawal denied due to insufficient balance."
					+ "Savings account must maintain minimum balance of 500.");
		}
		setBalance(this.getBalance()-amount);
	}
}
