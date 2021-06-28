package com.deitel.capitulo03.exercicio16;

import java.util.Scanner;

public class HeartRatesTest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String nome;
		String sobrenome;
		int diaNascimento;
		int mesNascimento;
		int anoNascimento;
		
		System.out.print("Digite o nome: ");
		nome = scanner.nextLine();
		
		System.out.print("Digite o sobrenome: ");
		sobrenome = scanner.nextLine();
		
		System.out.print("Digite o dia de nascimento: ");
		diaNascimento = scanner.nextInt();
		
		System.out.print("Digite o mês de nascimento: ");
		mesNascimento = scanner.nextInt();
		
		System.out.print("Digite o ano de nascimento: ");
		anoNascimento = scanner.nextInt();
		
		HeartRates heartRates = new HeartRates(nome, sobrenome, diaNascimento, mesNascimento, anoNascimento);
		
		System.out.printf("Idade: %d%n",heartRates.getIdade());
		System.out.printf("Frequência cardíaca máxima: %d%n",heartRates.getFrequenciaCardiacaMaxima());
		System.out.printf("Faixa da frequência cardíaca 50%%-85%%: %.0f-%.0f%n",heartRates.getFrequenciaCardiacaAlvoInferior(),heartRates.getFrequenciaCardiacaAlvoSuperior());
		
		scanner.close();
	}
}
