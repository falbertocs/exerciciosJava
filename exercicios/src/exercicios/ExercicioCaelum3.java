package exercicios;

/*
 * Imprima	todos	os	múltiplos	de	3,	entre	1	e	100.
 */

public class ExercicioCaelum3 {
	public static void main(String [] args) {
		int num = 1;
		while (num < 100) {
			int num2 = num % 3;
			if(num2 == 0) {
				System.out.println(num);
			}
			num ++;
		}
		
	}
}
