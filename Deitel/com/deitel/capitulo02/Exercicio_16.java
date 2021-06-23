package com.deitel.capitulo02;

import java.util.Scanner;

public class Exercicio_16
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
		
		if(x > y)
			System.out.printf("%d > %d", x, y);
		
		if(x == y)
			System.out.printf("%d == %d", x, y);
		
		if(y > x)
			System.out.printf("%d > %d", y, x);
		
		input.close();
	}
}
