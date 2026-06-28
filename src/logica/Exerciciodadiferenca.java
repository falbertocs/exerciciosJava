package logica;

import java.util.Scanner;

public class Exerciciodadiferenca {
	public static void main (String[]args) {
		int A, B, C, D, diferenca;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o número: ");
		A = sc.nextInt();
		System.out.print("Digite o número: ");
		B = sc.nextInt();
		System.out.print("Digite o número: ");
		C = sc.nextInt();
		System.out.print("Digite o número: ");
		D = sc.nextInt();
		diferenca = (A * B - C * D);
		System.out.println("DIFERENCA = " + diferenca);
	}

}
