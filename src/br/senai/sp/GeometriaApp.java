package br.senai.sp;

import br.senai.sp.model.Triangulo;

public class GeometriaApp {

	public static void main(String[] args) {


	System.out.println("Criando triângulos...");
	
	// Criando dois triângulos
	Triangulo t1 = new Triangulo();

	Triangulo t2 = new Triangulo();
		
	// Definindo as propriedades dos triângulos
	t1.altura = 20;
	t1.base = 10;
	t1.ladoB = 9;
	t1.ladoC = 22;
	t1.nome = "Triangulo 001";

	t2.altura = 12;
	t2.base = 5;
	t2.ladoB = 9;
	t2.ladoC = 10;
	t2.nome = "Triangulo 002";


	// Exibir dados dos triângulos
	t1.exibirDados();
	t2.exibirDados();



		}
}
