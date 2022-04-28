package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Account c1;
		
		System.out.print("Enter account number: ");
		int number = scan.nextInt();
		System.out.print("Enter account holder: ");
		String name = scan.next();
		System.out.println("Is there na initial deposit (y/n)? ");
		char choice = scan.next().charAt(0);
		if(choice == 'y') {
			System.out.print("Enter initial deposit value: ");
			double depositValue = scan.nextDouble();
			c1 = new Account(number, name, depositValue);
		}else {
			c1 = new Account(number, name);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println("Account " + c1);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double amount = scan.nextDouble();
		c1.deposit(amount);
		System.out.println("Updated account data: ");
		System.out.println("Account " + c1);
		System.out.println();
		
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		amount = scan.nextDouble();
		c1.withdraw(amount);
		System.out.println("Updated account data: ");
		System.out.println("Account " + c1);
		
	}

}
