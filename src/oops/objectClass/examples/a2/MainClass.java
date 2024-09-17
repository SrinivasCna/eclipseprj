package oops.objectClass.examples.a2;

public class MainClass {

	public static void main(String[] args) {
		Customer cust = new Customer();
		
		System.out.println(cust);
		
		cust.name = "Kaushik";
		cust.age = 25;
		System.out.println(cust.name);
		System.out.println(cust.age);
		System.out.println(cust);

	}

}
