package lambdas.functionalinterface.examples.a2;

public class LambdaWithFuntionalInterfaceExample {

	public static void main(String[] args) {
		// normal way
		Animal cat = new Animal() {

			@Override
			public void eat(String suffix) {
				System.out.println(" num num num " + suffix);
			}

		};
		cat.eat("!");

		// using lambdas
		Animal dog = (s) -> {

			System.out.println(" munch munch munch " + s);
		};
		dog.eat("#");

		// using lambdas further refining
		Animal cow = s -> System.out.println(" slurp slurp slurp " + s);
		cow.eat("$");

	}// end of main method()

}
