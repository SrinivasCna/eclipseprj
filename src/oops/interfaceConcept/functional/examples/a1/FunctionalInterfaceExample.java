package oops.interfaceConcept.functional.examples.a1;

public class FunctionalInterfaceExample {
	public static void main(String[] args) {
		Animal cat;
		// Cat=new Animal();
		cat = new Animal() {
			@Override
			public void sound() {
				System.out.println("Meow Meow Meow");
			}

		};
		cat.sound();

		Animal dog;
		dog = new Animal() {
			@Override
			public void sound() {
				System.out.println("Bow Bow Bow");
			}
		};
		dog.sound();

		Animal rat;
		rat = () -> System.out.println("Keeng Keeng");
		// () -> only works if there is only one method //ex. sound() from above
	}
}
