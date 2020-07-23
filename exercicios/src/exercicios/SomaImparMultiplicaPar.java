package exercicios;

public class SomaImparMultiplicaPar {
	
	/*
	 * Escreva um programa que imprima na tela a soma dos números ímpares entre
0 e 30 e a multiplicação dos números pares entre 0 e 30.

	 */

	public static void main(String[] args) {
		int par = 0, impar = 0, contador;
		
		// Contador inicia em 0; Faça o contador ir de 0 a 30; Cada vez que ele passar dentro do laço, adicione mais 1 (++)
		for (contador = 0; contador <= 30; contador ++) {
			
			//Se o resto da divisão for igual a zero, faça 		
			if(contador % 2 == 0) {
						par = par * contador;
					}
					/*
					else if(resto == 1) {
						
					}
					*/
					// Se o resto da divisão for diferente de 0
					else {
						impar = impar + contador; // Impar recebe o proprio impar + contador
						/*
						Ex: Impar = 1; Contador = 1 
						1 = 1 + 1
						1 = 2
						Impar = 2 
						*/
		}
	
	}
		System.out.println("Multiplicação do par: " +par);
		System.out.println("Soma do impar: " +impar);
}
}
