// Exercício 2.6
// Calcula o produto de três inteiros.
package com.deitel.capitulo02;

import java.util.Scanner;

public class Exercicio_06
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int x;
		int y;
		int z;
		int resultado;

		System.out.print( "Digite o primeiro inteiro: " );
		x = input.nextInt();
		
		System.out.print( "Digite o segundo inteiro: " );
		y = input.nextInt();

		System.out.print( "Digite o terceiro inteiro: " );
		z = input.nextInt();
		resultado = x * y * z;
		
		System.out.printf( "O produto é %d%n" , resultado);
		
		input.close();
	}
}
