package exercicios;

import java.util.*;

public class Calculadora {

	public static void main (String[]args) {
		
		Scanner in = new Scanner(System.in);
		double num1, num2, soma, subtracao, multiplicacao, divisao; 
		
		System.out.println("Digite o primeiro n�mero");
		num1 = in.nextDouble();
		
		System.out.println("Digite o segundo n�mero");
		num2 = in.nextDouble();
		
		soma = num1 + num2;
		System.out.println("O resultado da soma �: " +soma);
		
		subtracao = num1 - num2;
		System.out.println("O resultado da subtrac�o �: " +subtracao);
		
		multiplicacao = num1 * num2;
		System.out.println("O resultado da multiplica��o �: " +multiplicacao);
		
		divisao = num1 / num2;
		System.out.println("O resultado da divis�o �: " +divisao);
		
	}
	

}
