package com.deitel.capitulo03.exercicio17;

import java.util.Scanner;

public class HealhProfileTest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String nome;
		String sobrenome;
		String sexo;
		int diaNascimento;
		int mesNascimento;
		int anoNascimento;
		double altura;
		double peso;
		
		System.out.print("Digite o nome: ");
		nome = scanner.nextLine();
		
		System.out.print("Digite o sobrenome: ");
		sobrenome = scanner.nextLine();
		
		System.out.print("Digite o sexo: ");
		sexo = scanner.nextLine();
		
		System.out.print("Digite o dia de nascimento: ");
		diaNascimento = scanner.nextInt();
		
		System.out.print("Digite o mês de nascimento: ");
		mesNascimento = scanner.nextInt();
		
		System.out.print("Digite o ano de nascimento: ");
		anoNascimento = scanner.nextInt();
		
		System.out.print("Digite a altura [metros]: ");
		altura = scanner.nextDouble();
		
		System.out.print("Digite o peso [quilos]: ");
		peso = scanner.nextDouble();
		
		HealthProfile healthProfile = new HealthProfile(nome, sobrenome, sexo, diaNascimento, mesNascimento, anoNascimento, altura, peso);
		
		System.out.println("------------------------");
		System.out.printf("Health Profile: %s %s%n", healthProfile.getNome(), healthProfile.getSobrenome());
		System.out.printf("Idade: %d%n", healthProfile.getIdade());
		System.out.printf("Frequência cardíaca máxima: %d%n", healthProfile.getFrequenciaCardiacaMaxima());
		System.out.printf("Frequência cardíaca alvo 50%%-85%%: %.0f-%.0f%n", healthProfile.getFrequenciaCardiacaAlvoInferior(), healthProfile.getFrequenciaCardiacaAlvoSuperior());
		System.out.printf("IMC: %.2f", healthProfile.getImc());
		
		scanner.close();
	}
}
