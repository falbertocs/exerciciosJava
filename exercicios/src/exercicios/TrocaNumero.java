package exercicios;

import java.util.Scanner;

/*
 * Crie uma classe java TrocaNumero que contenha um m�todo que receba dois
n�meros NumA e NumB, nessa ordem, e imprima em ordem inversa, isto �, se os
dados lidos forem NumA = 5 e NumB = 9, por exemplo, devem ser impressos na
ordem NumA = 9 e NumB = 5.

 */

public class TrocaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int numA, numB;
		
		System.out.println("Digite um n�mero: ");
		numA = in.nextInt();
		
		System.out.println("Digite um n�mero: ");
		numB = in.nextInt();
		
		System.out.println("numA = " +numB);
		System.out.println("numB = " +numA);
		
		

	}

}
