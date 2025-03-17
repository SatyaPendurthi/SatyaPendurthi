package com.account;

public class Account
{
	int acctId;
	String acctType;
	int acctBalance;
	public Account(int acctId, String acctType, int acctBalance)
	{
		this.acctId = acctId;
		this.acctType = acctType;
		this.acctBalance = acctBalance;
	}
	public void deposit(int amount)
	{
		if (amount > 0) 
		{
			acctBalance = acctBalance+amount;
			System.out.println("Amount deposited successfully.");
		} 
		else
		{
			System.out.println("Invalid deposit amount.");
		}
	}
		
	public void withdraw(int amount)
	{
		if (amount > 0 && amount <= acctBalance)
		{
			acctBalance = acctBalance-amount;
            System.out.println("Amount withdrawn successfully.");
        } 
		else 
		{
            System.out.println("Invalid withdraw amount or insufficient balance.");
        }
	}
	public int getBalance()
	{
		return acctBalance;
	}
	public void display()
	{
		System.out.println("Account Id = "+acctId);
		System.out.println("Account Type = "+acctType);
		System.out.println("Account Balance = "+acctBalance);
	}
}