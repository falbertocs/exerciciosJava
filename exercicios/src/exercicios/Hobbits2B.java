package exercicios;

public class Hobbits2B {
	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hobbits2B[] h = new Hobbits2B[3];
		
		int z = -1;		
		while(z < 2) {
			z = z + 1;
			h[z] = new Hobbits2B();
			h[z].name = "Bilbo";
			if(z == 1) {
				h[z].name = "Frodo";
			}
			if(z == 2) {
				h[z].name = "Sam";
			}
			System.out.print(h[z].name + " é um ");
			System.out.println("good Hobbit name");
		}

	}

}
