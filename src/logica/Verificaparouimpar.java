package logica;

import java.util.Scanner;

public class Verificaparouimpar {
	public static void main (String []args) {
		
		Scanner sc = new Scanner (System.in);
		int numEntrada, result;
		
		System.out.print("Digite o número desejado");
		numEntrada = sc.nextInt();
		
		result = numEntrada % 2;
		
		if (result == 0) {
			System.out.print("PAR");
			
		}
		else {
			System.out.print("IMPAR");
		}
		sc.close();
	}

}
