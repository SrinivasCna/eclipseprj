package basics.ch_12_switch;

import java.util.Scanner;

public class SwitchWithIntegerDemo {

	public static void main(String[] args) {

		int dayOfWeek;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter day number");
		dayOfWeek = scanner.nextInt();
		switch (dayOfWeek) {
		case 1:
			System.out.println("MONDAY");
			break;
		case 2:
			System.out.println("TUESDAY");
			break;
		case 3:
			System.out.println("WEDNESDAY");
			break;
		case 4:
			System.out.println("THURSDAY");
			break;
		case 5:
			System.out.println("FRIDAY");
			break;
		case 6:
			System.out.println("SATURDAY");
			break;
		case 7:
			System.out.println("SUNDAY");
			break;
		default:
			System.out.println("ENTER VALUES BETWEEN 1 TO 7");

		}
		scanner.close();

	}

}
