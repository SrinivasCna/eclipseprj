package oops.inheritence.overriding.examples.a1;

public class OverridingExample {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.Sound();
		cat.fur();

		Dog d = new Dog();
		d.Sound();

		Animal a = new Animal();
		a.Sound();

	}

}
