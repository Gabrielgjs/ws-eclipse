package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		List<Product> list = new ArrayList<>();
		
		
		System.out.print("Enter the number of products: ");
		int n = scan.nextInt();
		scan.nextLine();
		for( int i = 1; i <= n; i++) {
			System.out.println("Product #"+ i+ " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = scan.next().charAt(0);
			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.print("Price: ");
			double price = scan.nextDouble();
			if (ch == 'i') {
				System.out.print("Customs fee: ");
				double customFee = scan.nextDouble();
				list.add(new ImportedProduct(name, price, customFee));
			} else if ( ch == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(scan.next());
				list.add(new UsedProduct(name, price, manufactureDate));
			} else {
				list.add(new Product(name, price));
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS: ");
		
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}
		
		scan.close();
	}

}
