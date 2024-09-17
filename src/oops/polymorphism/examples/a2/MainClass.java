package oops.polymorphism.examples.a2;

public class MainClass {
	public static void main(String[] args) {
		Animal ani = new Animal();
		ani.sound();

		ani = new Dog();
		ani.sound();

		ani = new Cat();
		ani.sound();

	}

}
