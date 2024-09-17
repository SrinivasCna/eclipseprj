package oops.superKeyword.examples.a2;

public class Animal {
	public int age;
	public String name;

	public Animal() {
	}

	public Animal(int age, String name) {
		this.name = name;
		this.age = age;
	}

	public void makeNoise() {
		System.out.println("Hello i am an Animal.");
	}

	public void eat() {
		System.out.println("Munch munch");
	}

	private void doSomethingPrivate() {
		System.out.println("Animals are Mating ");
	}
}
