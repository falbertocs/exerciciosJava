package Entite;

import java.util.Locale;
import java.util.Scanner;

public class ApplicationNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Student estudante = new Student();
		
		System.out.println("Digite o nome do Aluno");
		System.out.println("Digite A nota do primeiro trimestre de 0 a 30 "); 
		System.out.println("Digite A nota do segundo trimestre de 0 a 35 "); 
		System.out.println("Digite A nota do terceiro trimestre de 0 a 35 "); 
		
		estudante.notaTerceiroTri = sc.nextDouble();
		estudante.nomeDoAluno = sc.nextLine();
		estudante.notaPrimeiroTri = sc.nextDouble();
		estudante.notaSegundoTri = sc.nextDouble();
		
		if (estudante.calculoNotaPassou() >= 60) {
			System.out.printf("FINAL GRADE = %.2f%n", estudante.calculoNotaPassou() );
			System.out.printf("PASS");
		}
		else {
				System.out.printf("FINAL GRADE = %.2f%n", estudante.calculoNotaPassou());
				System.out.println("FAILED");
				System.out.printf("MISSING " + estudante.calculoNotaReprovou() + " POINTS");
		}

	}

}
