package com.deitel.capitulo02;

import java.util.Scanner;

public class Exercicio_25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero;
		
		System.out.print("Digite um número: ");
		numero = input.nextInt();

		if(numero%2 == 0)
			System.out.printf("%d é par.", numero);
		
		if(numero%2 == 1)
			System.out.printf("%d é ímpar.", numero);
		
		input.close();
	}
}
