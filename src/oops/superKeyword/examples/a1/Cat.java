package oops.superKeyword.examples.a1;

public class Cat extends Animal {
	@Override
	public void makeNoise() {

		super.makeNoise();
		System.out.println("meow meow meow ");

		// super is not required
		// super.eat();
		eat();

		// access to private methods not allowed
		// super.doSomethingPrivate();
	}
}
