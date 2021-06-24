package com.deitel.capitulo02;

import java.util.Scanner;

public class Exercicio_32 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero1, numero2, numero3, numero4, numero5;
		int negativos, positivos, zeros;
		
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
		
		negativos = 0;
		positivos = 0;
		zeros = 0;
		
		if(numero1 > 0)
			positivos = positivos + 1;
		if(numero1 < 0)
			negativos = negativos + 1;
		if(numero1 == 0)
			zeros = zeros + 1;
		
		if(numero2 > 0)
			positivos = positivos + 1;
		if(numero2 < 0)
			negativos = negativos + 1;
		if(numero2 == 0)
			zeros = zeros + 1;
		
		if(numero3 > 0)
			positivos = positivos + 1;
		if(numero3 < 0)
			negativos = negativos + 1;
		if(numero3 == 0)
			zeros = zeros + 1;
		
		if(numero4 > 0)
			positivos = positivos + 1;
		if(numero4 < 0)
			negativos = negativos + 1;
		if(numero4 == 0)
			zeros = zeros + 1;
		
		if(numero5 > 0)
			positivos = positivos + 1;
		if(numero5 < 0)
			negativos = negativos + 1;
		if(numero5 == 0)
			zeros = zeros + 1;
		
		System.out.println("----------------");
		System.out.printf("%d números negativos foram digitados%n", negativos);
		System.out.printf("%d números positivos foram digitados%n", positivos);
		System.out.printf("%d zeros foram digitados%n", zeros);
		
		input.close();
	}
}
