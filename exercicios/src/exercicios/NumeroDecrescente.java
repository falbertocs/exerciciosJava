package exercicios;

import java.util.Scanner;

public class NumeroDecrescente {
	/*
	 * . Crie uma classe java NumeroDecrescente que contenha um m�todo que receba
um n�mero inteiro e imprima, em ordem decrescente, o valor do n�mero at� 0.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int numeroDeEntrada, cont;
		
		System.out.println ("Digite o n�mero e ordenarei em ordem decrescente:");
		numeroDeEntrada = in.nextInt();
		
		while (numeroDeEntrada >= 0 ) {
		System.out.println (numeroDeEntrada);
		
		numeroDeEntrada --;		
		}
		
		
	}

}
