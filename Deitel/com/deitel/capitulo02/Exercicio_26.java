package com.deitel.capitulo02;

import java.util.Scanner;

public class Exercicio_26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero1, numero2;
		
		System.out.print("Digite primeiro número: ");
		numero1 = input.nextInt();
		
		System.out.print("Digite segundo número: ");
		numero2 = input.nextInt();

		if(numero1%numero2 == 0)
			System.out.printf("%d é multiplo de %d.", numero1, numero2);
		
		if(numero1%numero2 != 0)
			System.out.printf("%d NÃO é múltiplo de %d.", numero1, numero2);
		
		input.close();
	}
}
