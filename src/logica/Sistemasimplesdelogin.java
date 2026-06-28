package logica;

import java.util.Scanner;

public class Sistemasimplesdelogin {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		String usuario = "admin";
		int senha = 1234;
		
		System.out.printf("Digite o usuario ");
		usuario = sc.next();
		System.out.printf("Digite a senha ");
		senha = sc.nextInt();
		
		if(usuario.equals("admin") && senha == 1234) {
			System.out.println("Login realizado com sucesso");
		}
		
		else {
			System.out.println("Usuário ou senha inválidos");
		}
		
	}

}
