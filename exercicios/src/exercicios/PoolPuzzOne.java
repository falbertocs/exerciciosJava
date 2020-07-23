package exercicios;

/*
 * 
 * System.out.println("a");
 * System.out.println("an");
 * System.out.println("noys ");
 * System.out.println("oise ");
 * System.out.println("  oyster ");
 * System.out.println("annoys");
 * System.out.println("noise");
 * 
 * 
 * a noise
 * annoys
 * an oyster
*/

public class PoolPuzzOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		while(x < 4) {
			System.out.print("a");
			if (x < 1) {
				System.out.print(" ");
			}
			System.out.print("n");
			if(x > 1) {
				System.out.print(" oyster");
				x = x + 2;
			}
			if(x == 1) {
				System.out.print("noiys");
			}
			if (x < 1) {
				System.out.print("oise");
			}
			System.out.println(" ");
			x = x + 1;
		}

	}

}

