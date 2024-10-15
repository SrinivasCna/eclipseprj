package lambdas.functionalinterface.examples.a3;

public class LambdaWithFuntionalInterfaceExample {

	public static void main(String[] args) {
		// normal way
		Animal cat = new Animal() {

			@Override
			public void eat(String prefix, String suffix) {
				System.out.println(prefix + " num num num " + suffix);
			}

		};
		cat.eat("!", "!");

		// using lambdas
		Animal dog = (p, s) -> {

			System.out.println(p + " munch munch munch " + s);
		};
		dog.eat("#", "#");

		// using lambdas further refining
		Animal cow = (p, s) -> System.out.println(p + " slurp slurp slurp " + s);
		cow.eat("$", "$");

	}// end of main method()

}
