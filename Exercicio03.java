package br.com.generation.aula01.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// 3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica 
		//expressa em segundos e mostre-o expresso em horas, minutos e segundos.
		
		//Declara��o de variaveis:
		
		int Seg =28800, Min, Hrs;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("A dura��o do evento �: \n");
		System.out.println(+ Seg + " segundos");
		
		Min = Seg/60;
		Hrs = Min/60;
		
		System.out.println(+ Min + " minutos");
		System.out.println(+ Hrs + " horas");
		
	}

}
