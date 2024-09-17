package oops.exception.trycatch.examples.a1;

import java.util.Scanner;

public class TryCatchFinallyWithScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		System.out.print("Enter number: ");
		try {
			number = scanner.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Number entered is: " + number);
			scanner.close();
			System.out.println("Scanner is closed");
		}

	}

}
