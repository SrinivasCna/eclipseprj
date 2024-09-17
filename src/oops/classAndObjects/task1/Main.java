package oops.classAndObjects.task1;

/*
 * Create customer class with 3 instance variables namely
 * 1. name of type string
 * 2. mobile of type long
 * 3. city of type string
 * 
 * In main class 
 * create 2 objects and populate values
 * and print them in console 
 * 
 */

public class Main {

	public static void main(String[] args) {
		Customer care = new Customer();
		care.name = "MANJU";
		care.mobile = 123_456_789_1L;
		care.city = "Banglore";

		System.out.println(care.name);
		System.out.println(care.mobile);
		System.out.println(care.city);

	}

}
