package oops.thisKeyword.examples.a2;

public class Dog {
	private String name;
	private int age;

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
