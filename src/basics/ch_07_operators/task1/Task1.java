package basics.ch_07_operators.task1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * 
		 * Print CHILD if age is more than 0 and less than or equal to 12 Print TEEN if
		 * age is more than 12 but less than or equal to 17 Print ADULT if age is more
		 * than 17 but less than or equal to 50 Print SENIOR if age is more than 50 but
		 * less than or equal to 127 Print ENTER VALUES BETWEEN 1 AND 127 for all other
		 * values
		 */
		int age = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter age: ");
		age = scanner.nextInt();

		if (age > 0 && age <= 12) {
			System.out.println("CHILD");
		} else if (age > 12 && age <= 17) {
			System.out.println("TEEN");
		} else if (age > 17 && age <= 50) {
			System.out.println("ADULT");
		} else if (age > 50 && age <= 127) {
			System.out.println("SENIOR");
		} else {
			System.out.println("Enter AGE between 0 to 127");
		}

	}

}
