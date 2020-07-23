package exercicios;

import java.util.Scanner;

/*
 * Crie uma classe MediaAluno que contenha um atributo do tipo vetor de
inteiros com o nome de notas. Essa classe deve ter um método para adicionar
as notas nesse vetor (os valores que podem ser adicionados no vetor são os
inteiros entre 0 e 100, caso contrário imprime uma mensagem de erro e não
adiciona) 
e outro método que calcule a média de um aluno e imprima essa média
 */

public class MediaAluno {

	public static void main(String[] args) {
		
		Scanner entradaDeNotas = new Scanner (System.in);
		
		int[] notas = new int [101];
		int i;
		
		for(i = 0; i < 3; i++) {
			notas[i] = -1; 
			while (notas[i]<0 || notas[i]>10) {
					System.out.println("Entre com a nota do aluno: ");
					notas[i] = entradaDeNotas.nextInt();
					if (notas[i]<0 || notas[i]>10) {
						System.out.println("ESSE VALOR NAO É VALIDO");
					}
				}
			
		}
		
	}

}
