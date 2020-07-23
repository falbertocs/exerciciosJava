package exercicios;

import java.util.Scanner;

public class OlaNomeInformado {

	public static void main(String[] args) {
		
		String nome = "";
		
		Scanner lerTeclado = new Scanner (System.in);
		
		System.out.println ("Olá, seja vem vindo!");
		System.out.println ("Qual é o seu nome?");
		
		nome = lerTeclado.nextLine();
		
		System.out.println ("Olá " + nome);
		
		
		// TODO Auto-generated method stub

	}

}
