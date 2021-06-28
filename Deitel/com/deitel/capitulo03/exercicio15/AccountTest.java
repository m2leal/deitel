package com.deitel.capitulo03.exercicio15;

//Figura 3.9: AccountTest.Java
// Entrada e saída de números de ponto flutuante com objetos Account.
import java.util.Scanner;

public class AccountTest
{
	public static void main(String[] args)
	{
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", -7.53);

		// exibe saldo inicial de cada objeto
		displayAccount(account1);
		displayAccount(account2);

		// cria um Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);

		System.out.print("Enter deposit amount for account1: "); // prompt
		double depositAmount = input.nextDouble(); // obtém a entrada do usuário
		System.out.printf("%nadding %.2f to account1 balance%n%n",
				depositAmount);
		account1.deposit(depositAmount); // adiciona o saldo de account1ÿ

		// exibe os saldos
		displayAccount(account1);
		displayAccount(account2);
		System.out.print("Enter deposit amount for account2: "); // prompt
		depositAmount = input.nextDouble(); // obtém a entrada do usuário
		System.out.printf("%nadding %.2f to account2 balance%n%n",
				depositAmount);
		account2.deposit(depositAmount); // adiciona ao saldo de account2
		
		// exibe os saldos
		displayAccount(account1);
		displayAccount(account2);
		
		input.close();
	} // fim de main
	
	public static void displayAccount(Account accountToDisplay)
	{
		System.out.printf("%s balance: $%.2f %n",
				accountToDisplay.getName(),accountToDisplay.getBalance());
	}
	
} // fim da classe AccountTest