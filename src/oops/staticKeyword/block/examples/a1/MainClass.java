package oops.staticKeyword.block.examples.a1;

public class MainClass {

	public static void main(String[] args) throws Exception {
		// Both static block and instance block will be executed
		// Remo remo = new Remo();
		
		// only static block will be executed
		Class.forName("oops.staticKeyword.block.examples.a1.Remo");

	}

}
