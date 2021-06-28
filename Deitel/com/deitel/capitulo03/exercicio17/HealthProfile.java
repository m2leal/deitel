package com.deitel.capitulo03.exercicio17;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class HealthProfile {
	private String nome;
	private String sobrenome;
	private String sexo;
	private int diaNascimento;
	private int mesNascimento;
	private int anoNascimento;
	private double altura;
	private double peso;
	
	public HealthProfile(String nome, String sobrenome, String sexo, int diaNascimento, int mesNascimento,
			int anoNascimento, double altura, double peso) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.sexo = sexo;
		this.diaNascimento = diaNascimento;
		this.mesNascimento = mesNascimento;
		this.anoNascimento = anoNascimento;
		this.altura = altura;
		this.peso = peso;
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getDiaNascimento() {
		return diaNascimento;
	}

	public void setDiaNascimento(int diaNascimento) {
		this.diaNascimento = diaNascimento;
	}

	public int getMesNascimento() {
		return mesNascimento;
	}

	public void setMesNascimento(int mesNascimento) {
		this.mesNascimento = mesNascimento;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public long getIdade() {
		LocalDateTime aniversario = LocalDateTime.of(this.anoNascimento, this.mesNascimento, this.diaNascimento, 0, 0);
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
	
	public double getImc() {
		return peso/(altura*altura);
	}
}
