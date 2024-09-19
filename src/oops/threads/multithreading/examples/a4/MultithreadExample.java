package oops.threads.multithreading.examples.a4;

public class MultithreadExample {

	public static void main(String[] args) {
		// Remember Note:
		// If you want multiple concurrent thread you should use start() method

		for (int i = 1; i < 6; i++) {
			MultithreadThing myThing = new MultithreadThing(i);
			myThing.start();
		}
		throw new RuntimeException();
	}

}
