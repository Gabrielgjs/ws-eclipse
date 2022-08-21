package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Rent_Solution {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n = scan.nextInt();
	
		Student[] vect = new Student[10];
		for(int i = 1; i <= n	; i++) {
			System.out.println();
			System.out.println("Rent: " + i);
			System.out.print("Name: ");
			String name = scan.next();
			System.out.print("Email: ");
			scan.nextLine();
			String email = scan.next();
			System.out.print("Room: ");
			int room = scan.nextInt();
			
			vect[room] = new Student(name, email);
		}
		
		
		System.out.println("Busy rooms:");
		for (int i = 0; i < 10; i++) {
			if( vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		scan.close();
	}

}
