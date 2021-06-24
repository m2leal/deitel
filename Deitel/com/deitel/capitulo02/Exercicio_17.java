package com.deitel.capitulo02;

import java.util.Scanner;

public class Exercicio_17 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int x;
		int y;
		int z;
		
		System.out.print( "Digite o primeiro inteiro: " );
		x = input.nextInt();
		
		System.out.print( "Digite o segundo inteiro: " );
		y = input.nextInt();
		
		System.out.print( "Digite o terceiro inteiro: " );
		z = input.nextInt();
		
		int soma = x + y + z;
		System.out.printf("Soma: %d%n", soma);
		
		int media = soma/3;
		System.out.printf("Média: %d%n", media);
		
		int produto = x * y * z;
		System.out.printf("Produto: %d%n", produto);
		
		/* X e Y */
		if(x > y)
			System.out.printf("x(%d) > y(%d)%n", x, y);
		if(x == y)
			System.out.printf("x(%d) == y(%d)%n", x, y);
		if(x < y)
			System.out.printf("x(%d) < y(%d)%n", x, y);
		
		/* X e Z */
		if(x > z)
			System.out.printf("x(%d) > z(%d)%n", x, z);
		if(x == z)
			System.out.printf("x(%d) == z(%d)%n", x, z);
		if(x < z)
			System.out.printf("x(%d) < z(%d)%n", x, z);
		
		/* Y e Z */
		if(y > z)
			System.out.printf("y(%d) > z(%d)%n", y, z);
		if(y == z)
			System.out.printf("y(%d) == Z(%d)%n", y, z);
		if(y < z)
			System.out.printf("y(%d) > z(%d)%n", y, z);
		
		input.close();
	}
}
