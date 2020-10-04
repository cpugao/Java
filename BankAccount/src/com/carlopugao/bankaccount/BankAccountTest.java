package com.carlopugao.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account1 = new BankAccount();
		
		account1.depositChecking(67.23);
		account1.depositSavings(98.45);
		account1.withdrawFromChecking(2.23);
		account1.withdrawFromSavings(3.45);
		account1.accountBalance();
	}

}
