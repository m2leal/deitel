package com.deitel.capitulo03.exercicio11;

public class Account
{
	private String name;
	private double balance;
	
	public Account(String name, double balance)
	{
		this.name = name;

		if (balance > 0.0)
			this.balance = balance;
	}

	public void deposit(double depositAmount)
	{
		if (depositAmount > 0.0)
			balance = balance + depositAmount;
	}
	
	public void withdraw(double withdrawAmount)
	{
		if ( (balance - withdrawAmount) > 0.0)
			balance = balance - withdrawAmount;
	}

	public double getBalance()
	{
		return balance;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name; // retorna o valor de name ao chamador
	}
}
