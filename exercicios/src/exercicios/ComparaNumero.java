package exercicios;

import java.util.Scanner;

/*
 * Crie uma classe java ComparaNumero que contenha um método que receba
dois números e indique se são iguais ou se são diferentes. Mostre o maior e o
menor (nesta sequência).
 */
public class ComparaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		int num1, num2; 
		
		System.out.println("Digite um número:");
		num1 = in.nextInt();
		
		System.out.println("Digite outro número:");
		num2 = in.nextInt();
		
		if(num1 == num2) {
			System.out.println("Os números são iguais");
		}
		else if(num1 > num2) {
			System.out.println("O número " +num1+ " é o maior \nE o número " +num2+ " é o menor");
		}
		else {
			System.out.println("O número " +num2+ " é maior \n E o número " +num1+ "é o menor");
		}

	}

}
