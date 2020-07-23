package exercicios;

import java.util.Scanner;

public class NumeroDecrescente {
	/*
	 * . Crie uma classe java NumeroDecrescente que contenha um método que receba
um número inteiro e imprima, em ordem decrescente, o valor do número até 0.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int numeroDeEntrada, cont;
		
		System.out.println ("Digite o número e ordenarei em ordem decrescente:");
		numeroDeEntrada = in.nextInt();
		
		while (numeroDeEntrada >= 0 ) {
		System.out.println (numeroDeEntrada);
		
		numeroDeEntrada --;		
		}
		
		
	}

}
