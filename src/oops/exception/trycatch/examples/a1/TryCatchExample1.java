package oops.exception.trycatch.examples.a1;

public class TryCatchExample1 {
	public static void main(String[] args) {

		int a = 2;
		int b = 0;
		int result;

		try {
			// division
			result = a / b;
			System.out.println("division:" + result);
		} catch (Exception e) { // ArithmeticException
			// System.out.println(e);
			// System.err.println(e);// not gives detailed error
			e.printStackTrace();
		}

		// addition
		result = a + b;
		// System.out.println("addition of " + a + " + " + b + " is :" + result);
		System.out.println("addition : " + result);

	}
}
