package br.com.generation.aula01.exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		//Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.
		
		Scanner leia = new Scanner (System.in);
		
		int idadeAnos, idadeDias, idadeMeses;
		
		System.out.println("Digite a sua idade:");
		
		idadeAnos = leia.nextInt();
		
		
		idadeMeses = (idadeAnos * 12);
		idadeDias = (idadeAnos * 365);
				
	
		System.out.println("Sua idade corresponde a: " + idadeDias + " dias");
		
		
				
		
	}

}
