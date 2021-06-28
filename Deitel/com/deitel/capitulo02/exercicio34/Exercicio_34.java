package com.deitel.capitulo02.exercicio34;

public class Exercicio_34 {
	public static void main(String[] args) {
		
		
		float populacaoMundial = 7800000000f; // 7.8 bilhões
		float crescimento = 1f + (1.18f/100f); // 1.18% de crescimento
		
		System.out.printf("Populacao Mundial: %.0f%n",populacaoMundial);
		System.out.printf("Taxa de crescimento: %.4f%n",crescimento);
		System.out.println("--------------------------");
		populacaoMundial = populacaoMundial * crescimento;
		System.out.printf("Depois de 1 ano: %.0f%n",populacaoMundial);
		populacaoMundial = populacaoMundial * crescimento;
		System.out.printf("Depois de 2 anos: %.0f%n",populacaoMundial);
		populacaoMundial = populacaoMundial * crescimento;
		System.out.printf("Depois de 3 anos: %.0f%n",populacaoMundial);
		populacaoMundial = populacaoMundial * crescimento;
		System.out.printf("Depois de 4 anos: %.0f%n",populacaoMundial);
		populacaoMundial = populacaoMundial * crescimento;
		System.out.printf("Depois de 5 anos: %.0f%n",populacaoMundial);
	}
}
