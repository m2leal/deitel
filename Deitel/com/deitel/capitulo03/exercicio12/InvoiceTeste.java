package com.deitel.capitulo03.exercicio12;

public class InvoiceTeste
{
	public static void main(String[] args)
	{
		Invoice invoice1 = new Invoice("AA1111", "Cartucho de tinta", 100, 19.90);
		System.out.printf("%.2f%n",invoice1.getInvoiceAmount());
		
		Invoice invoice2 = new Invoice("AA2222", "Impressora", -100, 19.90);
		System.out.printf("%.2f%n",invoice2.getInvoiceAmount());
		
		Invoice invoice3 = new Invoice("AA3333", "Telefone Celular", 100, -19.90);
		System.out.printf("%.2f%n",invoice3.getInvoiceAmount());
		
		Invoice invoice4 = new Invoice("AA4444", "Teclado Mecânico", -100, -19.90);
		System.out.printf("%.2f%n",invoice4.getInvoiceAmount());
		
	}
}
