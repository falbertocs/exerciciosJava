package exercicios;

import java.util.*;

public class MaiorNumero {
	/*
	 * 1. Crie uma classe java MaiorNumero que contenha um m�todo que receba dois
n�meros inteiros e imprima o maior entre eles.
	 * 
	 */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num1, num2; 
		
		System.out.println("Digite o primeiro n�mero: ");
		num1 = in.nextInt();
		
		System.out.println("Digite o segundo n�mero");
		num2 = in.nextInt();
		
		if (num1 > num2) {
			
			System.out.println("O maior n�mero � " + num1 + " O primeiro que voc� digitou");
		}
		else
			System.out.println("O maior n�mero � " + num2 + " O segundo que voc� digitou");
			

	}

}
