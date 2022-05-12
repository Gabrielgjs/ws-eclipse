package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Progran {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = scan.nextInt();
		scan.nextLine();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i+ " data:");
			System.out.print("Outsourced (y/n)? ");
			char op = scan.next().charAt(0);
			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.print("Hours: ");
			int hours = scan.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = scan.nextDouble();
			if(op == 'n') {
				list.add(new Employee(name, hours, valuePerHour));
			}else {
				System.out.print("Additional charge: ");
				double addCharge = scan.nextDouble();
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, addCharge));
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		for (Employee emp : list) {
			System.out.println(emp);
		}
		/*
		for(Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + emp.payment());
		}*/
		
		scan.close();
	}

}
