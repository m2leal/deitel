package com.deitel.capitulo02;

import java.util.Scanner;

public class Exercicio_15
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int x;
		int y;

		System.out.print( "Digite o primeiro inteiro: " );
		x = input.nextInt();
		
		System.out.print( "Digite o segundo inteiro: " );
		y = input.nextInt();

		int soma = x + y;
		System.out.printf( "A soma é %d%n" , soma);
		
		int produto = x * y;
		System.out.printf( "O produto é %d%n" , produto);
		
		int diferenca = x - y;
		System.out.printf( "A diferença é %d%n" , diferenca);
		
		int quociente = x/y;
		System.out.printf( "O quociente é %d%n" , quociente);
		
		input.close();
	}
}
