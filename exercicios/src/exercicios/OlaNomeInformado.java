package exercicios;

import java.util.Scanner;

public class OlaNomeInformado {

	public static void main(String[] args) {
		
		String nome = "";
		
		Scanner lerTeclado = new Scanner (System.in);
		
		System.out.println ("Ol�, seja vem vindo!");
		System.out.println ("Qual � o seu nome?");
		
		nome = lerTeclado.nextLine();
		
		System.out.println ("Ol� " + nome);
		
		
		// TODO Auto-generated method stub

	}

}
