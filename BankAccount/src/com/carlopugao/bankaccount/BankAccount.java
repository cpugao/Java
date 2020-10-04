package com.carlopugao.bankaccount;

import java.util.Random;

public class BankAccount {
	private String accountNumber;
	private double checkBalance;
	private double savingsBalance;
	
	private static int numberOfAccounts = 0;
	private static double totalAmountInAccount = 0;
	
	private String generateRandomAccountNumber() {
		String numbers = "0123456789";
		String newAccountNumber = "";
		Random random = new Random();
		for (int i=0; i<5; i++) {
			int num = numbers.charAt(random.nextInt(10));
			newAccountNumber += num;
		}
		accountNumber = newAccountNumber;
		return accountNumber;
	}
	
	public BankAccount() {
		generateRandomAccountNumber();
		numberOfAccounts++;
		System.out.println(accountNumber);
	}

	public double getCheckBalance() {
		return checkBalance;
	}

	public void setCheckBalance(double checkBalance) {
		this.checkBalance = checkBalance;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	public void depositChecking(double checkBalance) {
		this.setCheckBalance(checkBalance);
		totalAmountInAccount += checkBalance;
		System.out.println("Checking: " + this.checkBalance);
	}
	
	public void depositSavings(double savingsBalance) {
		this.setSavingsBalance(savingsBalance);
		totalAmountInAccount += savingsBalance;
		System.out.println("Savings: " + this.savingsBalance);
	}
	
	public void withdrawFromChecking(double amount) {
		if (getCheckBalance() < amount) {
			System.out.println("Not enough money");
		}
		else {
			setCheckBalance(getCheckBalance() - amount);
		}
		System.out.println(this.checkBalance);
	}
	
	public void withdrawFromSavings(double amount) {
		if (getSavingsBalance() < amount) {
			System.out.println("Not enough money");
		}
		else {
			setSavingsBalance(savingsBalance - amount);
		}
		System.out.println(this.savingsBalance);
	}
	
	public void accountBalance() {
		System.out.println("Total balance is: $" + (this.getCheckBalance() + this.getSavingsBalance()));
	}
	
	
	
	

}
