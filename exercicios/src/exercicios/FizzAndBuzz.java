package exercicios;

public class FizzAndBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0; 
		do
		 {
			if (i == 3 || i == 6 || i == 9 || i == 12 ) {
				System.out.println("Fizz");
			}
			else if (i == 5 || i == 10 || i == 15) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
						
			} 
			i++;
		 }while (i <= 15);
	}
	}
