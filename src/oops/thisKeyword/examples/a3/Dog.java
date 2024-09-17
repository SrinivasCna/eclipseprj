package oops.thisKeyword.examples.a3;

public class Dog {
	private String name;
	private int age;

	// No Args Constructor
	public Dog() {
		// System.out.println("Hi Mom!"); // this is not allowed
		this("No name", 0);// this statement should be the very first line
		// calling a constructor in another constructor
	}

	public Dog(String name) {
		this.name = name;
		this.age = 1;
	}

	//
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}

// usage of this keyword is not allowed in static context
//public static void printStuff() {
//	this.name;
//}

	public String getName() {
		return this.name; // return name
	}

	public int getAge() {
		return this.age;
	}

	public void bark() {
		System.out.println("Bark");
	}

}
