package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = scan.nextLine();
		System.out.print("Email: ");
		String email = scan.nextLine();
		System.out.print("Birth date (DD/MM/YYYY)");
		Date birthDate = sdf.parse(scan.next());
		
		Client client = new Client(name, email, birthDate);
		System.out.println();
		
		System.out.println("Enter order data: ");
		OrderStatus status = OrderStatus.valueOf(scan.next());
		Order order = new Order(new Date(), status, client);
		scan.nextLine();
		System.out.print("How many items to this order? ");
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #" +i+ " item data:");
			System.out.print("Product name: ");
			scan.nextLine();
			String productName = scan.nextLine();
			System.out.print("Price: ");
			double productPrice = scan.nextDouble();
			System.out.print("Quantity: ");
			int quantity = scan.nextInt();
			OrderItem item = new OrderItem(quantity, productPrice, new Product(productName,productPrice));
			
			order.addItem(item);
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
	}

}
