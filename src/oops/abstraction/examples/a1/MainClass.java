package oops.abstraction.examples.a1;

public class MainClass {
	public static void main(String[] args) {
		Zomato customer;
		// customer=new Zomato(); // spits error// not allowed to initialize using abstract class

		customer = new GooglePay();
		customer.payment();
		customer.display();

		customer = new PhonePe();
		customer.payment();
		customer.display();

	}
}
