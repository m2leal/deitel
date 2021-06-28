package com.deitel.capitulo02.exercicio24;

import java.util.Scanner;

public class Exercicio_24 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numero1, numero2, numero3, numero4, numero5;
		int menor, maior;
		
		System.out.print("Digite o primeiro inteiro: ");
		numero1 = input.nextInt();
		
		System.out.print("Digite o segundo inteiro: ");
		numero2 = input.nextInt();
		
		System.out.print("Digite o terceiro inteiro: ");
		numero3 = input.nextInt();
		
		System.out.print("Digite o quarto inteiro: ");
		numero4 = input.nextInt();
		
		System.out.print("Digite o quinto inteiro: ");
		numero5 = input.nextInt();
		
		menor = numero1;
		maior = numero1;
		
		if(numero2 < menor)
			menor = numero2;
		if(numero2 > maior)
			maior = numero2;
		
		if(numero3 < menor)
			menor = numero3;
		if(numero3 > maior)
			maior = numero3;
		
		if(numero4 < menor)
			menor = numero4;
		if(numero4 > maior)
			maior = numero4;
		
		if(numero5 < menor)
			menor = numero5;
		if(numero5 > maior)
			maior = numero5;
		
		System.out.printf("O menor número digitado foi: %d%n", menor);
		System.out.printf("O maior número digitado foi: %d", maior);
		
		input.close();
		
	}
}
