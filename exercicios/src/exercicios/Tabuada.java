package exercicios;

import java.util.Scanner;

/******************** 
 * 2 Exercício: Crie um programa que exiba a tabuada de um número informado pelo usuário.
 * @author fcruzsil
 *
 */
public class Tabuada {
	
	public static void main (String [] args) {
		
		Scanner in = new Scanner(System.in);
		int numeroDeEntrada, i, resultado = 0;
		
		System.out.println("Digite um número e saberá sua tabuada");
		numeroDeEntrada = in.nextInt();
		
		for (i = 0; i <= 10; i++) {
			
			resultado = i * numeroDeEntrada;
			
			System.out.println("O Resultado é " + numeroDeEntrada + " x " +i + "= " + resultado);
		}
		
		
	}

}
