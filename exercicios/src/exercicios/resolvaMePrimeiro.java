package exercicios;

import java.util.Scanner;

/*
 * Complete a fun��o resolveMeFirst para calcular a soma de dois n�meros inteiros.

Fun��o prot�tipo:

int resolveMeFirst (int a, int b);

Onde,

a � a primeira entrada inteira.
b � a segunda entrada inteira
Retornar valores

soma dos dois inteiros acima
Entrada de amostra

a = 2
b = 3
Sa�da de amostra

5
Explica��o

A soma dos dois n�meros inteiros e � calculada como:.

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
		
		System.out.println("Digite o primeiro n�mero:" );
		a = in.nextInt();
		
		System.out.println("Digite o segundo n�mero" );
		b = in.nextInt();
		
		soma = a + b;
		
		System.out.println("O valor da soma � " +soma);
		

	}

}
