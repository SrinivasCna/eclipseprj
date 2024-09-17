package oops.constructor.examples.a2;

public class Employee {

	public String name;
	public String city;

	public Employee() {
		System.out.println("i am default constructor");
	}

	public Employee(String text, String text1) {
		System.out.println("i am employee constructor");
		this.name = text;
		this.city = text1;

	}

	public Employee(String text) {
		System.out.print("King ");
		name = text;
	}
}
