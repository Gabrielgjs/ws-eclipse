package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {

		File file = new File("C:\\temp\\in.txt");
		Scanner scan = null;
		try {
			scan = new Scanner(file);
			while (scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error opening file: " + e.getMessage());
		} finally {
			if (scan != null) {
				scan.close();
			}
			System.out.println("Finnaly block executed");
		}

	}

}
