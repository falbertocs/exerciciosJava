package exercicios;

import java.util.*;
public class IdadeDoCachorroXIdadeHumana {
	public static void main (String []args) {
		System.out.println("Digite a idade do seu cachorro: ");
		
		Scanner in = new Scanner (System.in);
		int idadeCachorro = in.nextInt();
		
		idadeCachorro = idadeCachorro * 7; 
		
		System.out.print("O seu Cachorro tem "  +idadeCachorro+ " anos");
	}

}
