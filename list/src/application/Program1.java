package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		
		List<Employee> list = new ArrayList<Employee>();
		
		System.out.print("How many employees will be registered? ");
		int n = scan.nextInt();
		System.out.println();
		
		for(int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Emplyoee #" + i + ":");
			
			System.out.print("Id: ");
			Integer id = scan.nextInt();
			while(hasId (list, id) ) {
				System.out.print("Id already taken. Try again: ");
				id = scan.nextInt();
			}
			scan.nextLine(); 
			System.out.print("Name: ");
			String name = scan.nextLine();
			System.out.print("Salary: ");
			double balance = scan.nextDouble();
			
			list.add(new Employee(id, name, balance));
			
		}
		
		
		System.out.println("Enter the employee id that will have salary increase: ");
		int id = scan.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}else {
			System.out.println("Enter the percentage: ");
			double percentage = scan.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		
		System.out.println();
		System.out.println("List of Employees: ");
		for (Employee funcionario : list) {
			System.out.println(funcionario);
		}
		
		
		scan.close();
	}

	private static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
	
	/*public static int position(List<Employee> list, int id) {
		for (int i =0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return -1;
	}*/

}
