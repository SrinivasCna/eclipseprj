package oops.staticKeyword.field.examples.a1;

public class MainClass {

	public static void main(String[] args) {
		Customer.city = "banglore";
		System.out.println(Customer.city);

		Customer.city = "shimoga";
		System.out.println(Customer.city);

		Customer object = new Customer();
		// not allowed to refer static fields
		// using object or reference variables
		// object.city;

	}

}
