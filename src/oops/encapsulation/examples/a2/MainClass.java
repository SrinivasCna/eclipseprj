package oops.encapsulation.examples.a2;

public class MainClass {	
	/*
	 * create customer class
	 * In customer class create  4 instances variables namely
	 * 1. name of type String
	 * 2. city of type String
	 * 3. age of type int
	 * 4. mobile of type Long
	 * Make sure you achieve encapsulation
	 * create 2 objects in main methods of main class 
	 * and give values and show values
	 */
	public static void main(String[] args) {

		Customer cus = new Customer();
		cus.setName("Bob");
		cus.setAge(21);
		cus.setMobile(123_456_789L);
		cus.setCity("Banglore");

		System.out.println(cus.getName());
		System.out.println(cus.getCity());
		System.out.println(cus.getMobile());
		System.out.println(cus.getAge());
		System.out.println();
		

		Customer cool = new Customer();
		cool.setName("Maurya");
		cool.setCity("Manglore");
		// cool.setCity("cillian");
		cool.setAge(20);
		cool.setMobile(456_458_7862L);

		System.out.println(cool.getName());
		System.out.println(cool.getCity());
		System.out.println(cool.getCity());
		System.out.println(cool.getAge());
		System.out.println(cool.getMobile());

	}

}
