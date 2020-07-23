package exercicios;

public class Fatoriais {
	public static void main (String[] args) {
		 long fatorial = 1;
	        for (int n = 1; n <= 30; n++) {
	        		/*
	        		 * Ex: Quando n = 7 
	        		 * A variavel fatorial está guardando o ultimo resultado 720
	        		 * fatorial = 720 * 7
	        		 */ 
	                fatorial = fatorial * n;
	            System.out.println("Fatorial de "+n+" = "+fatorial);

	        }		 				
	}

}
