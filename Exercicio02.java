package br.com.generation.aula01.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// 2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.

		
		int idadeDias, idadeMeses, idadeAnos;       //declarar variaveis
				
		Scanner leia = new Scanner (System.in);    //leitura das variaveis
		
		System.out.println("Digite sua idade: ");  //frase de inicio
		
		idadeAnos = leia.nextInt(); 			//leia e atribua valor a variavel
		
		idadeDias = (idadeAnos*365);
		idadeMeses = (idadeAnos*12);
		
		System.out.println("Sua idade equivale a: " +idadeAnos + " anos");
		System.out.println("Sua idade equivale a: " +idadeMeses + " meses");
		System.out.println("Sua idade equivale a: " +idadeDias + " dias");
		
		
		
	}

}
