package exercicios;

import java.util.Scanner;

/******************** 
 * 2 Exerc�cio: Crie um programa que exiba a tabuada de um n�mero informado pelo usu�rio.
 * @author fcruzsil
 *
 */
public class Tabuada {
	
	public static void main (String [] args) {
		
		Scanner in = new Scanner(System.in);
		int numeroDeEntrada, i, resultado = 0;
		
		System.out.println("Digite um n�mero e saber� sua tabuada");
		numeroDeEntrada = in.nextInt();
		
		for (i = 0; i <= 10; i++) {
			
			resultado = i * numeroDeEntrada;
			
			System.out.println("O Resultado � " + numeroDeEntrada + " x " +i + "= " + resultado);
		}
		
		
	}

}
