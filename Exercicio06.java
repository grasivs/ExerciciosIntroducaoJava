package br.com.generation.aula01.exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// 6. Construa um programa em Java que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a dist�ncia entre eles.
		// A f�rmula que efetua tal c�lculo �:

				
		Scanner leia = new Scanner (System.in);
		
		double x1, x2, y1, y2;    //Declara��o de variaveis  
		double d; 
		double p1, p2;            //onde o calculo ir� ficar
			
		System.out.println("Digite o valor de x1: ");
		x1 = leia.nextDouble();
		
		System.out.println("Digite o valor de y1: ");
		y1 = leia.nextDouble();
		
		
		System.out.println("Digite o valor de x2: ");
		x2 = leia.nextDouble();
		
		System.out.println("Digite o valor de y2: ");
		y2 = leia.nextDouble();
		
		p1 = Math.pow((x2 - x1), 2); //pega os valores de x2 e x1 e atribui a eles //pow --> potencia
		p2 = Math.pow((y2 - y1), 2);
		
		d = Math.sqrt(p1+p2); //calculando raiz quadrada
		
		System.out.println("A dist�ncia entre os pontos �: " + d );
	}

}
