package oops.inheritence.examples.a2;

public class InheritenceExample {
	/*
	 * create a class Animal in Animal class create a method sound() create Class
	 * Cat create Class Dog show inheritance between Animal and Cat class & Dog
	 * Class in this main method with the help of two objects
	 * 
	 */
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.Sound();
		cat.fur();

		Dog d = new Dog();
		d.Sound();
		d.sound1();

		Animal a = new Animal();
		a.Sound();

	}

}
