package lambdas.functionalinterface.examples.a5;

public class MainClass {

	public static void main(String[] args) {
		Printable x = new Printable() {

			@Override
			public void print() {
				System.out.println(" meow meow ");

			}

		};
		x.print();

		Printable y = () -> System.out.println("meow meeeow");
		y.print();

		Cat cat = new Cat();// same
		printThing(cat);// same
		printThing(new Cat());// but different

	}

	public static void printThing(Printable x) {
		x.print();
	}

}
