package exercicios;

public class SomaImparMultiplicaPar {
	
	/*
	 * Escreva um programa que imprima na tela a soma dos n�meros �mpares entre
0 e 30 e a multiplica��o dos n�meros pares entre 0 e 30.

	 */

	public static void main(String[] args) {
		int par = 0, impar = 0, contador;
		
		// Contador inicia em 0; Fa�a o contador ir de 0 a 30; Cada vez que ele passar dentro do la�o, adicione mais 1 (++)
		for (contador = 0; contador <= 30; contador ++) {
			
			//Se o resto da divis�o for igual a zero, fa�a 		
			if(contador % 2 == 0) {
						par = par * contador;
					}
					/*
					else if(resto == 1) {
						
					}
					*/
					// Se o resto da divis�o for diferente de 0
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
		System.out.println("Multiplica��o do par: " +par);
		System.out.println("Soma do impar: " +impar);
}
}
