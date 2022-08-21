package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramArrays {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double[] tempMediaAnual = new double[5];
		for(int i=0; i< tempMediaAnual.length; i++) {
			tempMediaAnual[i] = scan.nextDouble();
		}
		System.out.println("--------");
		for(double t : tempMediaAnual) {
			System.out.println(t);
		}
	}

}
