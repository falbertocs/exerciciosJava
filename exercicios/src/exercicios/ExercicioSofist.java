package exercicios;

import java.util.Scanner;

public class ExercicioSofist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double a, x, y, z;  
		
		System.out.println("Digite o primeiro n�mero");
		a = in.nextDouble();
		
		System.out.println("Digite o segundo n�mero");
		x = in.nextDouble();
		
		System.out.println("Digite o terceiro n�mero");
		y = in.nextDouble();
		
		z = (x + y) + (7 + a);
		
		if (z <= 0 ) {
			System.out.println("escreve" + z + "A reposta � A");
				}
		else if (z <= 100 ) {
			System.out.println("escreve" + z + "A reposta � B");
		}
		else if (z <= 150 ) {
			System.out.println("escreve " + z + " A reposta � D");
		}
		else if (z <= 200 ) {
			System.out.println("escreve" + z + "A reposta � C");
		}
		else {
			System.out.println("escreve" + z + "A reposta � E");
		}
		
	}

}
