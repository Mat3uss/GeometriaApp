package br.senai.sp.model;

public class Triangulo {
	
	public double base;
	public double ladoB;
	public double ladoC;
	public double altura;
	public String nome;
	
	public void exibirDados() {
		System.out.println("----------------");
		System.out.println(nome);
		System.out.println("----------------");
		System.out.println("base:= " + base);
		System.out.println("ladob:= " + ladoB);
		System.out.println("ladoc= " + ladoC);
		System.out.println("altura= " + altura);
		System.out.println();
	}
}

