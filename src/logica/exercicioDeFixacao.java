package logica;

import java.util.Locale;

public class exercicioDeFixacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double prince1 = 2100.00;
		double prince2 = 650.50;
		double measure = 53.234567;
		
		System.out.println ("Products:");
		System.out.println (product1 + ", which prince is $" + prince1);
		// Outra forma de mostrar a mesma coisa no código
		System.out.printf ("%s, which prince is $ %.2f%n",product2, prince2 );
		System.out.printf ("Record: %d years old, code %d and gender: %c%n", age, code, gender);
		System.out.println ();
		System.out.printf("Measue with eigth decimal places: %.8f%n", + measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
		
	}

}
