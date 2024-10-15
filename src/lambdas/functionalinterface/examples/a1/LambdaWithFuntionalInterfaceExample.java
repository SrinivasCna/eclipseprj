package lambdas.functionalinterface.examples.a1;

public class LambdaWithFuntionalInterfaceExample {

	public static void main(String[] args) {
		// normal way
		Animal cat = new Animal() {

			@Override
			public void eat() {
				System.out.println(" num num num ");
			}

		};
		cat.eat();

		// using lambdas
		Animal dog = () -> {

			System.out.println(" munch munch munch");
		};
		dog.eat();

		// using lambdas further refining
		Animal cow = () -> System.out.println(" slurp slurp slurp ");
		cow.eat();

	}// end of main method

}
