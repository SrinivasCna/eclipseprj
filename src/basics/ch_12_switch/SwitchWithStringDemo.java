package basics.ch_12_switch;

import java.util.Scanner;

public class SwitchWithStringDemo {

	public static void main(String[] args) {
		String monthName;
		Scanner scanner = new Scanner(System.in);
		System.out.print("ENTER FIRST 3 CHARACTERS OF A MONTH NAME: ");
		monthName = scanner.nextLine();

		switch (monthName) {
		case "JAN":
			System.out.println(monthName + ": " + 31);
			break;
		case "FEB":
			System.out.println(28);
			break;
		case "MAR":
			System.out.println(31);
			break;
		case "APR":
			System.out.println(30);
			break;
		case "MAY":
			System.out.println(31);
			break;
		case "JUN":
			System.out.println(30);
			break;
		case "JUL":
			System.out.println(31);
			break;
		case "AUG":
			System.out.println(31);
			break;
		case "SEP":
			System.out.println(30);
			break;
		case "OCT":
			System.out.println(31);
			break;
		case "NOV":
			System.out.println(30);
			break;
		case "DEC":
			System.out.println(31);
			break;
		default:
			System.out.println("ENTER THE CORRECT FIRST 3 CHARACTERS OF MONTH NAME");

		}
		scanner.close();

	}

}
