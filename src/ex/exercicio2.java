package ex;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		employee employee = new employee(); 
		System.out.println("Name: ");
		employee.name = sc.nextLine();
		System.out.println("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println("Employee: " + employee);
		
		System.out.println("Which percentage to increasy salary? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println("Updated data: " + employee);
		
		sc.close();
	}

}
