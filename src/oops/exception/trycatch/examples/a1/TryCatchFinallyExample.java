package oops.exception.trycatch.examples.a1;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		int a = 2;
		int b = 0;
		int result = 0;

		try {
			// division
			result = a / b;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("division: " + result);
		}
		// addition
		result = a + b;
		System.out.println("addition: " + result);

	}

}
