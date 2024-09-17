package basics.ch_07_operators.comparison;

public class ComaparisonOperatorDemo {

	public static void main(String[] args) {
		// Comparison Operators

		// " == " check left value is equal to right value or not
		// " == " equal to or not
		// returns true or false

		boolean isTrueOrFalse;
		isTrueOrFalse = 1 == 1;
		System.out.println(isTrueOrFalse); // true

		int a = 1;
		int b = 1;
		isTrueOrFalse = a == b;
		System.out.println(isTrueOrFalse); // true

		// "<" less than operator
		// returns true or false
		System.out.println(-1 < 1); // true

		// ">" greater than operator
		// returns true or false
		System.out.println(-1 > 1); // false

		// " != " not equal to operator
		// returns true or false
		System.out.println(-1 != 1); // true

		// "<=" less than or equal to operator
		// returns true or false
		System.out.println(0 <= -1); // false

		// ">=" greater than or equal to operator
		// returns true or false
		System.out.println(0 >= -1); // true

	}

}
