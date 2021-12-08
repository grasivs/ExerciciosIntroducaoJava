package br.com.generation.aula01.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// 3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica 
		//expressa em segundos e mostre-o expresso em horas, minutos e segundos.
		
		//Declaração de variaveis:
		
		int Seg =28800, Min, Hrs;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("A duração do evento é: \n");
		System.out.println(+ Seg + " segundos");
		
		Min = Seg/60;
		Hrs = Min/60;
		
		System.out.println(+ Min + " minutos");
		System.out.println(+ Hrs + " horas");
		
	}

}
