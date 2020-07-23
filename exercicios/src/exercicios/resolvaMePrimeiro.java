package exercicios;

import java.util.Scanner;

/*
 * Complete a função resolveMeFirst para calcular a soma de dois números inteiros.

Função protótipo:

int resolveMeFirst (int a, int b);

Onde,

a é a primeira entrada inteira.
b é a segunda entrada inteira
Retornar valores

soma dos dois inteiros acima
Entrada de amostra

a = 2
b = 3
Saída de amostra

5
Explicação

A soma dos dois números inteiros e é calculada como:.

 *import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solveMeFirst(int a, int b) {
      // Hint: Type return a+b; below
       return (a + b);
     
	}

 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
	}
}

 *
 */

public class resolvaMePrimeiro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a, b, soma; 
		
		System.out.println("Digite o primeiro número:" );
		a = in.nextInt();
		
		System.out.println("Digite o segundo número" );
		b = in.nextInt();
		
		soma = a + b;
		
		System.out.println("O valor da soma é " +soma);
		

	}

}
