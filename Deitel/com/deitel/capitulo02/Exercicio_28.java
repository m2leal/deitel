package com.deitel.capitulo02;

import java.util.Scanner;

public class Exercicio_28 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int raio;
		
		System.out.print("Digite o raio: ");
		raio = scanner.nextInt();
		
		System.out.printf("Diâmetro: %d%n", 2*raio);
		System.out.printf("Circunferência: %.2f%n", 2*Math.PI*raio);
		System.out.printf("Área: %.2f%n", Math.PI*raio*raio);
		
		scanner.close();
	}
}
