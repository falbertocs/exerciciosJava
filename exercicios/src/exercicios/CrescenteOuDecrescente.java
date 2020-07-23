package exercicios;

import java.util.Scanner;

public class CrescenteOuDecrescente {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.println("Digite 1 para ordem Crescente \nDigite 2 para ordem Decrescente");
		num1 = in.nextInt();
		
		if(num1 == 1) {
			System.out.println("Digite um número e colocarei em ordem Crescente");
			num2 = in.nextInt();
			
			for (num3 =0; num3 <= num2; num3++) {
				System.out.println(num3);
				}
		}
		
		else if(num1 == 2) {
			System.out.println("Digite um número e colocarei em ordem Decrescente");
			num2 = in.nextInt();
			while(num2 >= 0) {
				System.out.println(num2);
				num2 --;
			}
		}
		
		else {
			System.out.println("ERROR");
		}
	}

}
