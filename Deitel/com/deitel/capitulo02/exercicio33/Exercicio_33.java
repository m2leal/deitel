package com.deitel.capitulo02.exercicio33;

import java.util.Scanner;

public class Exercicio_33 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double peso, altura;
		double imc;
		
		System.out.print("Digite o peso em quilos [Ex.: 80.5]: ");
		peso = scanner.nextDouble();
		
		System.out.print("Digite a altura em metros [Ex.: 1.80]: ");
		altura = scanner.nextDouble();

		imc = peso / (altura*altura);
		
		System.out.println("--------------------------");
		System.out.println("Valores IMC de referência");
		System.out.println("Subpeso: Menor que 18.5");
		System.out.println("Normal: Entre 18.5 e 24.9");
		System.out.println("Sobrepeso: Entre 25 e 29.9");
		System.out.println("Obeso: 30 ou mais");
		System.out.println("--------------------------");
		
		System.out.printf("IMC = %f indica ", imc);
		if(imc < 18.5)
			System.out.println("subpeso");
		if(imc >= 18.5 && imc <= 25)
			System.out.println("peso normal");
		if(imc > 25 && imc <= 30)
			System.out.println("sobrepeso");
		if(imc > 30)
			System.out.println("obesidade");
			
		scanner.close();
	}
}
