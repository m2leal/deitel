package com.deitel.capitulo03.exercicio16;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class HeartRates {
	private String nome;
	private String sobrenome;
	private int dia;
	private int mes;
	private int ano;
	
	public HeartRates(String nome, String sobrenome, int dia, int mes, int ano) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public long getIdade() {
		LocalDateTime aniversario = LocalDateTime.of(this.ano, this.mes, this.dia, 0, 0);
		LocalDateTime dataAtual = LocalDateTime.now();
		
		long diferenca = ChronoUnit.YEARS.between(aniversario, dataAtual);
		
		return diferenca;
	}
	
	public long getFrequenciaCardiacaMaxima() {
		long idade = this.getIdade();
		long frequenciaMaxima = 220 - idade;
		
		return frequenciaMaxima;
	}
	
	public double getFrequenciaCardiacaAlvoInferior() {
		long frequenciaCardiacaMaxima = getFrequenciaCardiacaMaxima();
		
		return frequenciaCardiacaMaxima * 0.5;
	}
	
	public double getFrequenciaCardiacaAlvoSuperior() {
		long frequenciaCardiacaMaxima = getFrequenciaCardiacaMaxima();
		
		return frequenciaCardiacaMaxima * 0.85;
	}
}
