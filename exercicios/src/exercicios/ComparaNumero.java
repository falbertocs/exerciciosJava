package exercicios;

import java.util.Scanner;

/*
 * Crie uma classe java ComparaNumero que contenha um m�todo que receba
dois n�meros e indique se s�o iguais ou se s�o diferentes. Mostre o maior e o
menor (nesta sequ�ncia).
 */
public class ComparaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		int num1, num2; 
		
		System.out.println("Digite um n�mero:");
		num1 = in.nextInt();
		
		System.out.println("Digite outro n�mero:");
		num2 = in.nextInt();
		
		if(num1 == num2) {
			System.out.println("Os n�meros s�o iguais");
		}
		else if(num1 > num2) {
			System.out.println("O n�mero " +num1+ " � o maior \nE o n�mero " +num2+ " � o menor");
		}
		else {
			System.out.println("O n�mero " +num2+ " � maior \n E o n�mero " +num1+ "� o menor");
		}

	}

}
