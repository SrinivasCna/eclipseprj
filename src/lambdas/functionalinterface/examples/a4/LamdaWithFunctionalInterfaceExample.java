package lambdas.functionalinterface.examples.a4;

public class LamdaWithFunctionalInterfaceExample {

	public static void main(String[] args) {
		// normal code
		MathOperation add1 = new MathOperation() {

			@Override
			public int operation(int a, int b) {
				// int result=a+b;
				// return result;
				return a + b;
			}
		};
		int result;
		result = add1.operation(2, 2);
		System.out.println(" addition 1 " + result);

		// using lambda expression
		MathOperation add2 = (a, b) -> {
			return a + b;
		};
		result = add2.operation(4, 4);
		System.out.println(" addition 2 " + result);

		// using lambda expression but further refined
		MathOperation add3 = (a, b) -> a + b;
		result = add3.operation(6, 6);
		System.out.println(result);
	}// end of main method

}
