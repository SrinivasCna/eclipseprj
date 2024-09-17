package oops.exception.trycatch.examples.a2;

public class ThrowsExceptionExample {

	public static void main(String[] args) throws InterruptedException {
		fun();
		
		System.out.println("Programming is going to sleep now");
		Thread.sleep(3000);
		System.out.println("Program awake now");
	}

	public static void fun() {

		try {
			// throw new NullPointerException("some fun");
			throw new ArithmeticException("some fun");

		} catch (Exception e) {
			System.out.println("We are having fun!");
			e.printStackTrace();

		}

	}

}
