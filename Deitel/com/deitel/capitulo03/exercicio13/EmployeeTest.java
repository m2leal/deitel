package com.deitel.capitulo03.exercicio13;

public class EmployeeTest
{
	public static void main(String[] args)
	{
		Employee employee1 = new Employee("Nome1", "Sobrenome1", 5000.0);
		Employee employee2 = new Employee("Nome2", "Sobrenome2", 7000.0);
		
		System.out.printf("Salario anual 1: %.2f%n", employee1.getSalarioMensal()*12);
		System.out.printf("Salario anual 2: %.2f%n", employee2.getSalarioMensal()*12);
		
		double novoSalario1 = employee1.getSalarioMensal()*1.01;
		double novoSalario2 = employee2.getSalarioMensal()*1.01;
		
		employee1.setSalarioMensal(novoSalario1);
		employee2.setSalarioMensal(novoSalario2);
		
		System.out.printf("Salario mensal 1: %.2f%n", employee1.getSalarioMensal());
		System.out.printf("Salario mensal 2: %.2f%n", employee2.getSalarioMensal());
	}
}
