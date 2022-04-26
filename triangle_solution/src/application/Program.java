package application;

import model.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Triangle x , y;
		x = new Triangle();
		y = new Triangle();
		
		
		System.out.println("Entre the measures of trinagle X: ");
		x.a = scan.nextDouble();
		x.b = scan.nextDouble();
		x.c = scan.nextDouble();
		System.out.println("Entre the measures of trinagle Y: ");
		y.a = scan.nextDouble();
		y.b = scan.nextDouble();
		y.c = scan.nextDouble();
		
		double areaX = x.Area();
		double areaY = y.Area();
		
		
		System.out.printf("Trinagle X area : %.4f%n", areaX);
		System.out.printf("Trinagle Y area : %.4f%n", areaY);
		
		if ( areaX > areaY) {
			System.out.println("Larger area: X");
		}else {
			System.out.println("Larger area: Y");
		}
		
		scan.close();
	} 

}
