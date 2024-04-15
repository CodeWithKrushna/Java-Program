package com.javaInterface;
interface Account 
{
	void deposit(double amount);
	void withdraw(double amount);
}
class SavingAccount implements Account
{
	private double balance;
	private double interestRate;
	
	//constructor
	public SavingAccount(double balance, double interestRate) 
	{
		this.balance= balance;
		this.interestRate= interestRate;
	}
	
	//override method
	public void deposit(double amount)
	{
		balance+= amount;
		System.out.println("Deposite"+ amount+"New Balance:"+ balance);
	}
	
	public void withdraw(double amount)
	{
		if(amount<= balance) 
		{
			balance-=amount;
			System.out.println("Withdrawn" + amount+"New balance:"+ balance);
		}
		else
		{
			System.out.println("Insufficient balance:"+ amount);
		}
	}
}
class CurrentAccount
{
	private double balance;
	private double overddraftLimit;
	//constructor
	//override method
}

public class BankMain {

	public static void main(String[] args) {
		//object of saving and current account
				SavingAccount SA = new SavingAccount(5000, 100);	
				SA.deposit(1500);
				SA.withdraw(2000);


	}

}
