package BankAccountSystem;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String accountType = sc.next();
		int accountNumber  = sc.nextInt();
		double balance = sc.nextDouble();
		double amount = sc.nextDouble();
		Account account;
		try {
			if(accountType.equals("Savings")) {
				account = new SavingsAccount(accountNumber,balance);
			}else {
				account = new CurrentAccount(accountNumber,balance);
			}
			
			account.withdraw(amount);
			System.out.println("Withdrawal successful");
			System.out.println("Remaing = "+(int)account.getBalance());
		}catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	}

}
