package com.javademo;
abstract class BankAccount
{
	abstract void deposit();
	abstract void withdraw();
}
class SavingAccount extends BankAccount
{

	@Override
	void deposit()
	{
		System.out.println("Your Saving Account Deposit is :- 40,000 Rs");
		
	}

	@Override
	void withdraw() 
	{
		System.out.println("Withdraw your Saving Account Money is :-10,000 Rs ");
		System.out.println();
	}
	
} 
class CurrentAccount extends BankAccount
{

	@Override
	void deposit() 
	{
		System.out.println("Your Current Account Deposit is :- 80,000 Rs");
		
	}

	@Override
	void withdraw()
	{
		System.out.println("Withdraw your Current Account Money is :-50,000 Rs ");
		
	}
	
}
public class BankAccoundMain
{

	public static void main(String[] args)
	{
		SavingAccount SA =new SavingAccount();
		CurrentAccount CA = new CurrentAccount();
		
		SA.deposit();
		SA.withdraw();
		
		CA.deposit();
		CA.withdraw();

	}

}
