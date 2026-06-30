package Entite;

import java.util.Locale;
import java.util.Scanner;

public class ApplicationSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emply = new Employee();
		
		System.out.printf("Name: ");
		emply.name = sc.nextLine();
		System.out.printf("Gross salary: ");
		emply.grossSalary = sc.nextDouble();
		System.out.printf("Tax: ");
		emply.tax =  sc.nextDouble();
		System.out.println(" ");
		System.out.printf("Employee " + emply.name + ", $ %.2f%n", emply.netSalary());
		System.out.println(" ");
		System.out.printf("Which percentage to increase salary? ");
		emply.porcento = sc.nextDouble();
		System.out.println(" ");
		System.out.printf("Update data: " + emply.name + ", $ %.2f%n", emply.increaseSalary(emply.porcento));

	}

}
