package exercicios;

import java.io.PrintStream;
import java.util.Scanner;

public class MediaAlunoDiferente {
	
	int nota;
	//public class Exemplo {

	public static void main(String[] args) throws Exception {
		MediaAlunoDiferente programa = new MediaAlunoDiferente();
		programa.executar();
			}
	private final Scanner entrada = new Scanner(System.in);
	private final PrintStream saida = System.out;
	
	public void executar() {
		int[] notas = new int[3];
		for (int i = 0; i < notas.length; i++) {
			notas[i] = lerNota();
		}
		double media = calcularMedia(notas);
		saida.printf("A média do aluno é %.2f%n", media);
	}
	private double calcularMedia(int[] notas) {
		int soma = 0;
		for (int nota: notas) {
			soma += nota;
		}
		return soma / (double) notas.length;
	}
	private int lerNota() {
		while(true) {
			saida.println("O valor atribuido a nota não é valido.");
			continue;
		}
	}
	

}
