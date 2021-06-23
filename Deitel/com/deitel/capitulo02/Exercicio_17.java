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
		System.out.printf("Soma: %d", soma);
		
		int media = soma/3;
		System.out.printf("Média: %d", media);
		
		if(x > y)
			System.out.printf("%d > %d", x, y);
		
		if(x == y)
			System.out.printf("%d == %d", x, y);
		
		if(y > x)
			System.out.printf("%d > %d", y, x);
		
		input.close();
	}
}
