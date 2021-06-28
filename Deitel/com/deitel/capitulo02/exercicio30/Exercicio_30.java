package com.deitel.capitulo02.exercicio30;

import java.util.Scanner;

public class Exercicio_30 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		
		System.out.print("Digite um número de 5 dígitos: ");
		numero = scanner.nextInt();
		
		System.out.print(numero/10000);
		System.out.print("   ");
		System.out.print((numero%10000)/1000);
		System.out.print("   ");
		System.out.print((numero%1000)/100);
		System.out.print("   ");
		System.out.print((numero%100)/10);
		System.out.print("   ");
		System.out.print(numero%10);
		
		scanner.close();
	}
}
