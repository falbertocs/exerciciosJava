package exercicios;

import java.util.*;

public class MaiorNumero {
	/*
	 * 1. Crie uma classe java MaiorNumero que contenha um método que receba dois
números inteiros e imprima o maior entre eles.
	 * 
	 */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num1, num2; 
		
		System.out.println("Digite o primeiro número: ");
		num1 = in.nextInt();
		
		System.out.println("Digite o segundo número");
		num2 = in.nextInt();
		
		if (num1 > num2) {
			
			System.out.println("O maior número é " + num1 + " O primeiro que você digitou");
		}
		else
			System.out.println("O maior número é " + num2 + " O segundo que você digitou");
			

	}

}
