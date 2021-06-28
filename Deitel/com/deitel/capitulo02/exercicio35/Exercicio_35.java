package com.deitel.capitulo02.exercicio35;

import java.util.Scanner;

public class Exercicio_35 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int kmPorDia;
		int precoPorLitro;
		int kmPorLitro;
		int taxaEstacionamento;
		int pedagioPorDia;
		
	    System.out.print("Quilômetros totais dirigidos por dia: ");
	    kmPorDia = scanner.nextInt();
	    
	    System.out.print("Preço por litro de gasolina: ");
		precoPorLitro = scanner.nextInt(); 
		
		System.out.print("Quilômetros médios por litro: ");
		kmPorLitro = scanner.nextInt();
		
		System.out.print("Taxas de estacionamento por dia: ");
		taxaEstacionamento = scanner.nextInt();
		
		System.out.print("Pedágio por dia: ");
		pedagioPorDia = scanner.nextInt();
		
		int litroPorDia = kmPorDia / kmPorLitro;
		int gastoComGasolina = litroPorDia * precoPorLitro;
		
		int gastoTotal = gastoComGasolina + taxaEstacionamento + pedagioPorDia;

		System.out.printf("Gasto total para dirigir para o trabalho: R$ %d", gastoTotal);
		
		scanner.close();
	}
}
