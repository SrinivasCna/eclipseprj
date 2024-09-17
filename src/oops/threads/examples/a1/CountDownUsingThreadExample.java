package oops.threads.examples.a1;

public class CountDownUsingThreadExample {
	public static void main(String[] args) throws Exception {
		countDown(30);
	}

	public static void countDown(int number) throws Exception {
		for (int i = number; i > -1; i--) {
			System.out.println(" i= " + i);
			Thread.sleep(1000);
		}

	}

}
