package logica;

import java.util.Locale;
import java.util.Scanner;

public class Exerciciodopais {
	public static void main (String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double salario, faixa1DoImposto, total, total1, faixa2DoImposto,faixa3DoImposto;
		
		System.out.printf("Digite o valor do salario ");
		salario = sc.nextDouble();
		
		if(salario > 0.00 && salario <= 2000.00) {
			System.out.printf("Isento");
		}
		else if(salario > 2000.01 && salario <= 3000.00) {
			faixa1DoImposto = 3000.00 - 2000.00;
				total = faixa1DoImposto / 100 * 8;
				System.out.printf("R$ %.2f%n", total);
			}
			
		
	else if(salario > 3000.01 && salario <= 4500.00){
			faixa1DoImposto = 1000.00;
			faixa2DoImposto = salario - 3000.00;
			total = (faixa1DoImposto /100 * 8) + (faixa2DoImposto / 100 * 18);
				System.out.printf("R$ %.2f%n", total);
					}
		
	 else {
		faixa1DoImposto = 1000.00;
		faixa2DoImposto = 1500.00;
		faixa3DoImposto = salario - 4500.00;
		total = (faixa1DoImposto /100 * 8) + (faixa2DoImposto / 100 * 18) + (faixa3DoImposto / 100 * 28);
		
		System.out.printf("R$ %.2f%n", total);
	}
	}
}
