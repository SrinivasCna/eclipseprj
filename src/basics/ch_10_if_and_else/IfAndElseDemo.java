package basics.ch_10_if_and_else;

public class IfAndElseDemo {

	public static void main(String[] args) {
		// IF AND ELSE
		// control statement

		if (true) {
			// TRUE => if block
			System.out.println("CONDITION IS TRUE");
		} else {
			// FALSE => else block
			System.out.println("CONDITION IS FALSE");
		}
		if (false) {
			// TRUE => if block
			System.out.println("CONDITION IS TRUE");
		} else {
			// FALSE => else block
			System.out.println("CONDITION IS FALSE");
		}

		// this is not a best practice
		// don't follow the the below method 
		if (true)
		System.out.println("1: TRUE"); // if block
		System.out.println("1: ANYTHING");

		if (false)
			System.out.println("2: TRUE"); // TRUE =>if block
		
		System.out.println("2: ANYTHING");
		
		if(false) {
			// TRUE => if block
			System.out.println("3: IF TRUE");
		}else if(true) {
			// TRUE=> else if block
			System.out.println("3: ELSE IF TRUE");
		}else {
			// EVERYTHING FALSE => else block
			System.out.println("3: ELSE FALSE");
		}
			

	}

}
