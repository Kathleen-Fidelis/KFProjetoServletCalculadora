package com.proj.servlets;

public class Calculadora {

	private int valor1;
	private int valor2;
	
	Calculadora(int v1, int v2){
		this.valor1 = v1;
		this.valor2 = v2;
	}
	
	public int somar() {
		return this.valor1 + this.valor2;
	}
	
	public int divir() {
		return this.valor1 / this.valor2;
	}
	
	public int subtrair() {
		return this.valor1 - this.valor2;
	}
	
	public int multiplicar() {
		return this.valor1 * this.valor2;
	}
}
