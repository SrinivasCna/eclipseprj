package oops.finalKeyword.examples.a1;

public class FinalExample {
	public static final double PI = 3.14159;

	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.sound();

		final Dog yourDog;
		yourDog = new Dog();

		// yourDog = new Dog(); // final allows us to initialize only once and we can't
		// change 2nd time

		int a;
		a = 100;
		a = 200;

		// final double pi = 3.14159;
		// pi=3.1427;
		System.out.println(PI);

	}

}
