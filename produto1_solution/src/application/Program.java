package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter product data");
		System.out.print("Name: ");
		String name = scan.next();
		System.out.print("Price: ");
		double price = scan.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = scan.nextInt();
		Product p1 = new Product(name, price, quantity);
		
		p1.setName("Computer");
		System.out.println("Update name: " + p1.getName());
		
		System.out.println();
		System.out.print("Product data:" + p1);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantityAdd = scan.nextInt();
		p1.AddProducts(quantityAdd);
		System.out.print("Update data: " + p1);
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		int quantityRemove = scan.nextInt();
		p1.RemoveProducts(quantityRemove);
		System.out.println("Update data: " + p1);
		
		
		scan.close();

	}

}
