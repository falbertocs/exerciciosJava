package exercicios;
/*
 * 2.	Imprima	a	soma	de	1	até	1000.
 */

public class ExercicioCaelum2 {
	public static void main(String[]args) {
		int num = 1;
		while (num < 1001) {
			System.out.println(num);
			num =num + num;
		}
		
	}

}
