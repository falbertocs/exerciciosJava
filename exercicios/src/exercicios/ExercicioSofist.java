package exercicios;

import java.util.Scanner;

public class ExercicioSofist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double a, x, y, z;  
		
		System.out.println("Digite o primeiro número");
		a = in.nextDouble();
		
		System.out.println("Digite o segundo número");
		x = in.nextDouble();
		
		System.out.println("Digite o terceiro número");
		y = in.nextDouble();
		
		z = (x + y) + (7 + a);
		
		if (z <= 0 ) {
			System.out.println("escreve" + z + "A reposta é A");
				}
		else if (z <= 100 ) {
			System.out.println("escreve" + z + "A reposta é B");
		}
		else if (z <= 150 ) {
			System.out.println("escreve " + z + " A reposta é D");
		}
		else if (z <= 200 ) {
			System.out.println("escreve" + z + "A reposta é C");
		}
		else {
			System.out.println("escreve" + z + "A reposta é E");
		}
		
	}

}
