package com.test;

public class BankAccount {
	public static double balance;
	public BankAccount(double b){
		balance = b ;
	}
	public void deposit(double amount) {
		balance += amount;
	}
	public String withdrawAmount(double amount) {
		if(amount<0 ) {
			throw new ArithmeticException("Invalid amount");
		}else if(amount>balance) {
			return "Insufficient balance";
		}else {
			balance -= amount;
			return "successfull withdrawal";
		}
	}
	public double getBalance() {
		return balance;
	}


}
