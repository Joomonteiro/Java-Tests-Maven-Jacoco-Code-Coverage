package com.testes.TestesDois;

public class Date {
	private int mes;
	private int dia;
	private int ano;
	
	public Date(int mes, int dia, int ano) {
		super();
		this.mes = mes;
		this.dia = dia;
		this.ano = ano;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String displayDate() {
		return this.mes+"/"+this.dia+"/"+this.ano;
	}
	
	
}
