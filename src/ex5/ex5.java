package ex5;

import java.util.Locale;
import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		double number = sc.nextDouble();
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		System.out.print("Is there a initial deposit (y/n) ? ");
		boolean isDeposit = sc.hasNextLine();
		double deposit;
		if (isDeposit == true) {
			System.out.print("Enter initial deposit value: ");
			deposit = sc.nextDouble();
		} else {
			deposit = 0;
		}
		Account account = new Account();
		
		System.out.printf("Account data:\nAccount " + number + ", Holder: "
				+ name + ", Balance: $ %.2f", deposit);
		
		sc.close();		
	}	
}
