package com.deitel.capitulo03.exercicio12;

public class Invoice {
	private String numero;
	private String descricao;
	private int quantidadeComprada;
	private double precoPorItem;
	
	public Invoice(String numero, String descricao, int quantidadeComprada, double precoPorItem)
	{
		this.numero = numero;
		this.descricao = descricao;
		
		this.quantidadeComprada = quantidadeComprada;
		if(quantidadeComprada<0)
			this.quantidadeComprada = 0;
		
		this.precoPorItem = precoPorItem;
		if(precoPorItem<0.0)
			this.precoPorItem=0.0;
	}

	public String getNumero()
	{
		return numero;
	}

	public void setNumero(String numero)
	{
		this.numero = numero;
	}

	public String getDescricao()
	{
		return descricao;
	}

	public void setDescricao(String descricao)
	{
		this.descricao = descricao;
	}

	public int getQuantidadeComprada()
	{
		return quantidadeComprada;
	}

	public void setQuantidadeComprada(int quantidadeComprada)
	{
		this.quantidadeComprada = quantidadeComprada;
		if(quantidadeComprada<0)
			this.quantidadeComprada = 0;
	}

	public double getPrecoPorItem()
	{
		return precoPorItem;
	}

	public void setPrecoPorItem(double precoPorItem)
	{
		this.precoPorItem = precoPorItem;
		if(precoPorItem<0.0)
			this.precoPorItem=0.0;
	}
	
	public double getInvoiceAmount()
	{
		return quantidadeComprada * precoPorItem;
	}
}